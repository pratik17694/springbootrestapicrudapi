import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ProductmoduleModule } from './product/productmodule/productmodule.module';

import { SupplierModule } from './supplier/supplier.module';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    ProductmoduleModule,
    SupplierModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
