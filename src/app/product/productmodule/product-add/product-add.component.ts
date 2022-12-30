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
    alert("we are at save method");
    this.cs.pro.productID=this.savepro.get('productID').value;
    this.cs.pro.productName=this.savepro.get('productName').value;
    this.cs.pro.productPrice=this.savepro.get('productPrice').value;
    this.cs.pro.supplier=this.savepro.get('supplier').value;
    this.cs.saveProductData(this.cs.pro).subscribe();
    window.location.reload();
  }

  
}