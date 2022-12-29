import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SupplieraddComponent } from './supplierModule/supplieradd/supplieradd.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
   SupplieraddComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[
    SupplieraddComponent, ReactiveFormsModule, FormsModule, HttpClientModule
  ]
})
export class SupplierModule { }
