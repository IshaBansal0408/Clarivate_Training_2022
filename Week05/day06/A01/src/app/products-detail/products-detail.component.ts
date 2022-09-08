import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../Services/products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products-detail',
  templateUrl: './products-detail.component.html',
  styleUrls: ['./products-detail.component.css'],
})
export class ProductsDetailComponent implements OnInit {
  router: any;
  errorMessage: any;
  constructor(private pservice: ProductsService) {}

  allProducts: any;
  ngOnInit(): void {
    this.allProducts = this.pservice.getData().subscribe(
      (data) => {
        this.allProducts = data;
        this.allProducts = this.allProducts.products;
        console.log(this.allProducts);
      },
      (err) => {
        // window.alert(err.message);
        // console.log(err.message);
        this.errorMessage = err.message;
        // console.log(this.errorMessage);
      }
    );
  }

  deleteProduct(id: any) {
    this.pservice.deleteData(id).subscribe(
      (res) => {
        console.log(res);
        this.router.navigate(['products-detail']);
        // reload the project
        this.pservice.getData().subscribe((data) => {
          this.allProducts = data;
          this.allProducts = this.allProducts.products;
        });
      },
      (err) => {
        console.log(err.message);
        this.errorMessage = err.message;
      }
    );
  }
}
