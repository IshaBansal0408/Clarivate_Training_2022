import { ProductsService } from './../Services/products.service';
import { NgForm } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { subscribeOn } from 'rxjs';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
})
export class AddProductComponent implements OnInit {
  constructor(private pservice: ProductsService) {}

  ngOnInit(): void {}
  addProduct(form: NgForm) {
    console.log(form.value);
    return this.pservice.addData(form.value).subscribe((res) => {
      console.log(res);
    });
  }
}
