import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Supplier } from 'src/app/Model/supplier';

import { CommonserviceService } from 'src/app/shared/commonservice.service';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent {
  constructor(private fb:FormBuilder, public cs:CommonserviceService)
  {}

  savepro:FormGroup;
  ngOnInit(){
    this.savepro= this.fb.group({
      productID:[],
      productName:[],
      productPrice:[],
      supplier:[]
    })
    
    this.cs.getSupplier().subscribe((supp:Supplier[])=>{
      this.cs.supp1=supp;
    })
  }

  saveProduct()
  {
    
    this.cs.saveProductData(this.savepro.value).subscribe((data:any)=>{alert(data.msg)});
    window.location.reload();
  }

  
}