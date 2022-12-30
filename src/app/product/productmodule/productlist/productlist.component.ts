import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from 'src/app/Model/product';
import { Supplier } from 'src/app/Model/supplier';
import { CommonserviceService } from 'src/app/shared/commonservice.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

  constructor(public cs:CommonserviceService, private fb:FormBuilder, public router:Router )
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
    
  }

  updateProduct(prod:Product)
  {
    this.cs.pro1=Object.assign({},prod);
    this.router.navigate(['/productadd'])
  }

  deleteProduct(productID:number)
  {
    this.cs.deleteData(productID).subscribe();
    window.location.reload();
  }

}
