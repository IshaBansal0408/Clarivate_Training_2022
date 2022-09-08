import { ProductsService } from './../Services/products.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
})
export class AddProductComponent implements OnInit {
  constructor(private pservice: ProductsService) {}

  ngOnInit(): void {}

  addProduct(form: NgForm) {
    // console.log(form.value);
    this.pservice.addData(form.value).subscribe((res) => {
      console.log(res);
    });
  }
}
