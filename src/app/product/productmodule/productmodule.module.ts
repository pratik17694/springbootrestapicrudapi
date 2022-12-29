import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductlistComponent } from './productlist/productlist.component';
import { ProductAddComponent } from './product-add/product-add.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
   ProductlistComponent,
   ProductAddComponent
  ],
  imports: [
    CommonModule, ReactiveFormsModule, FormsModule, HttpClientModule, 
  ],
  exports:[
    ProductlistComponent,
    ProductAddComponent
  ]
})
export class ProductmoduleModule { }
