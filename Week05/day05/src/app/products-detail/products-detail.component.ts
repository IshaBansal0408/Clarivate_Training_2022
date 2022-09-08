import { ProductsService } from './../Services/products.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products-detail',
  templateUrl: './products-detail.component.html',
  styleUrls: ['./products-detail.component.css'],
})
export class ProductsDetailComponent implements OnInit {
  constructor(private pservice: ProductsService, private router: Router) {}
  allProducts: any;
  ngOnInit(): void {
    // we get data in form of 'observable' and need to 'subscribe' it later (lazy loading)
    // first callback is success callback
    this.pservice.getData().subscribe((data) => {
      this.allProducts = data;
      this.allProducts = this.allProducts.products;
      // console.log(this.allProducts);
    });
  }

  deleteProduct(id: any) {
    this.pservice.deleteData(id).subscribe((res) => {
      console.log(res);
      this.router.navigate(['products-detail']);
      this.pservice.getData().subscribe((data) => {
        this.allProducts = data;
        this.allProducts = this.allProducts.products;
      });
    });
  }
}
