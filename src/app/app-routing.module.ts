import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductlistComponent } from './product/productmodule/productlist/productlist.component';
import { ProductAddComponent } from './product/productmodule/product-add/product-add.component';
import { SupplieraddComponent } from './supplier/supplierModule/supplieradd/supplieradd.component';

const routes: Routes = [
  {
    path:'productlist', component:ProductlistComponent
  },
  {
    path:'productadd', component:ProductAddComponent
  },
  {
    path:'supplieradd', component:SupplieraddComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
