import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { ProductsService } from '../Services/products.service';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css'],
})
export class EditProductComponent implements OnInit {
  // dependency injection
  constructor(
    private route: ActivatedRoute,
    private pservice: ProductsService
  ) {}

  productDetails: any;
  selectedProduct: any;

  ngOnInit(): void {
    // extract id parameter
    let id = this.route.snapshot.params['id'];
    console.log('Id of the product is : ', id);

    // extract all the data
    this.pservice.getData().subscribe((data) => {
      this.productDetails = data;
      this.productDetails = this.productDetails.products;

      for (let p of this.productDetails) {
        // getting the data which needs to be updated
        if (p._id == id) {
          // setting the product
          this.selectedProduct = p;
          console.log(this.selectedProduct);
        }
      }
    });
  }

  editProduct(form: NgForm) {
    this.pservice
      .editData(this.selectedProduct._id, form.value)
      .subscribe((res) => {
        console.log(res);
      });
  }
}
