import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductsComponent } from './products/products.component';

import { RouterModule } from '@angular/router';
import { ProductPriceComponent } from './product-price/product-price.component';
import { ProductDescriptionComponent } from './product-description/product-description.component';
import { ProductHomeComponent } from './product-home/product-home.component';

@NgModule({
  declarations: [
    ProductsComponent,
    ProductPriceComponent,
    ProductDescriptionComponent,
    ProductHomeComponent,
  ],
  imports: [
    CommonModule,
    RouterModule.forChild([
      { path: 'products', component: ProductsComponent },
      { path: 'price', component: ProductPriceComponent },
      { path: 'home', component: ProductHomeComponent },
      { path: 'description', component: ProductDescriptionComponent },
    ]),
  ],
  exports: [],
})
export class ProductsModule {}
