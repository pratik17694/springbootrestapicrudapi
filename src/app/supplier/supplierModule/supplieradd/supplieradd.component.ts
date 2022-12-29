import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-supplieradd',
  templateUrl: './supplieradd.component.html',
  styleUrls: ['./supplieradd.component.css']
})
export class SupplieraddComponent {

  constructor(private fb:FormBuilder){}
 

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
  {}
}
