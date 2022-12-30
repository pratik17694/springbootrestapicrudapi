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
    CommonModule,FormsModule, HttpClientModule,ReactiveFormsModule
  ],
  exports:[
    SupplieraddComponent,  
  ]
})
export class SupplierModule { }
