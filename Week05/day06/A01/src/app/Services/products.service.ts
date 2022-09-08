import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductsService {
  // Take out JWT token
  // token = localStorage.getItem('token');
  constructor(private http: HttpClient) {}

  // Get data
  getData() {
    return this.http.get('https://ty-shop-token.herokuapp.com/api/products');
  }

  // Add Product Detail
  addData(product: any) {
    return this.http.post(
      'https://ty-shop-token.herokuapp.com/api/products',
      product
      // {
      //   headers: new HttpHeaders({
      //     Authorization: `Bearer ${this.token}`,
      //   }),
      // }
    );
  }

  // Getting JWT token
  getToken() {
    return localStorage.getItem('token');
  }

  // Edit Product Detail
  editData(_id: any, product: any) {
    return this.http.put(
      `https://ty-shop.herokuapp.com/api/products/${_id}`,
      product,
      {
        headers: new HttpHeaders({
          Authorization: `Bearer ${this.getToken()}`,
        }),
      }
    );
  }

  // deleting a Product
  deleteData(_id: any) {
    return this.http.delete(
      `https://ty-shop.herokuapp.com/api/products/${_id}`,
      {
        headers: new HttpHeaders({
          Authorization: `Bearer ${this.getToken()}`,
        }),
      }
    );
  }
}
