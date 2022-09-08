import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ProductsDetailComponent } from './products-detail/products-detail.component';
import { AddProductComponent } from './add-product/add-product.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AuthorizationInterceptor } from './authorization.interceptor';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ProductsDetailComponent,
    AddProductComponent,
    EditProductComponent,
    HomeComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [
    {
      // provide : what we using : name of interceptor class name
      provide: HTTP_INTERCEPTORS,
      useClass: AuthorizationInterceptor,
      // we can use multiple interceptors
      multi: true,
    },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
