import { Injectable } from '@angular/core';
import { Product } from '../Model/product';
import { HttpClient } from '@angular/common/http';
import { Supplier } from '../Model/supplier';

@Injectable({
  providedIn: 'root'
})
export class CommonserviceService {

  constructor(private http:HttpClient) { }

  pro:Product={
    productID: 0,
    productName: '',
    productPrice: 0,
    supplier: new Supplier
  }

  pro1:Product={
    productID: 0,
    productName: '',
    productPrice: 0,
    supplier: new Supplier
  }

  prodg:Product[];

  saveProductData(product:Product)
  {
    alert("we are at Commonservice")
    return this.http.post("http://localhost:9090/api/product", product);
  }

  getProduct()
  {
    return this.http.get<Product[]>("http://localhost:9090/api/getProduct");
  }

  updateData(pro:Product)
  {
    return this.http.put("http://localhost:9090/api/product"+"/"+pro.productID, this.pro1);
  }

  deleteData(productID:number)
  {
    return this.http.delete("http://localhost:9090/api/delete"+"/"+productID);
  }
}
