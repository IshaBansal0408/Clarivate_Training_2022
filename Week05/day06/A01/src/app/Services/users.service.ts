import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UsersService {
  // dependency injection
  constructor(private http: HttpClient) {}

  // Register a User
  addUser(user: any) {
    return this.http.post(
      'https://ty-shop-token.herokuapp.com/api/users/register',
      user
    );
  }

  // Login User
  loginUser(user: any) {
    return this.http.post(
      'https://ty-shop-token.herokuapp.com/api/users/login',
      user
    );
  }
}
