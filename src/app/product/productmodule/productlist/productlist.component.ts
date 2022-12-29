import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Product } from 'src/app/Model/product';
import { CommonserviceService } from 'src/app/shared/commonservice.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

  constructor(public cs:CommonserviceService, private fb:FormBuilder )
  {}

  savepro:FormGroup;

  ngOnInit()
  {
    this.cs.getProduct().subscribe((prod:Product[])=>{
    this.cs.prodg=prod;
    })

    this.savepro= this.fb.group({
      productID:[],
      productName:[],
      productPrice:[]
    })

  }

  saveProduct()
  {
    if(this.savepro.get('productID').value==0)
    {
    alert("we are at save method");
    this.cs.pro.productID=this.savepro.get('productID').value;
    this.cs.pro.productName=this.savepro.get('productName').value;
    this.cs.pro.productPrice=this.savepro.get('productPrice').value;
    this.cs.saveProductData(this.cs.pro).subscribe();
    }
    else
    {
      alert("we are at save method");
    this.cs.pro1.productID=this.savepro.get('productID').value;
    this.cs.pro1.productName=this.savepro.get('productName').value;
    this.cs.pro1.productPrice=this.savepro.get('productPrice').value;
    this.cs.updateData(this.cs.pro1).subscribe();
    }
    window.location.reload();
  }

  updateProduct(prod:Product)
  {
    this.cs.pro1=Object.assign({},prod);
  }

  deleteProduct(productID:number)
  {
    this.cs.deleteData(productID).subscribe();
    window.location.reload();
  }

}
