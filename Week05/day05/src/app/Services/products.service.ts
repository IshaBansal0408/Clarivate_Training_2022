import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductsService {
  // dependency injection
  constructor(private http: HttpClient) {}

  // getting the data from server
  getData() {
    return this.http.get('https://ty-shop.herokuapp.com/api/products');
  }

  // add Product Details
  addData(product: any) {
    return this.http.post(
      'https://ty-shop.herokuapp.com/api/products',
      product
    );
  }

  // updating a Product
  editData(_id: any, product: any) {
    return this.http.put(
      `https://ty-shop.herokuapp.com/api/products/${_id}`,
      product
    );
  }

  // deleting a Product
  deleteData(_id: any) {
    return this.http.delete(
      `https://ty-shop.herokuapp.com/api/products/${_id}`
    );
  }
}
