import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonserviceService } from 'src/app/shared/commonservice.service';

@Component({
  selector: 'app-supplieradd',
  templateUrl: './supplieradd.component.html',
  styleUrls: ['./supplieradd.component.css']
})
export class SupplieraddComponent {

  constructor(private fb:FormBuilder, private cs:CommonserviceService){}
 

  savesup:FormGroup;

  ngOnInit()
  {
    this.savesup=this.fb.group({
      supplierID:[],
      supplierName:[],
      supplierContact:[]
    })
  }
  saveSupplier()
  {
    this.cs.sup.supplierID=this.savesup.get('supplierID').value;
    this.cs.sup.supplierName=this.savesup.get('supplierName').value;
    this.cs.sup.supplierContact=this.savesup.get('supplierContact').value;
    this.cs.saveSupplierData(this.cs.sup).subscribe();
  }
}
