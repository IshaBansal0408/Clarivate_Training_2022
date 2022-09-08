import { ProductsService } from './Services/products.service';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'A01';

  constructor(private service: ProductsService, private router: Router) {}

  logOut() {
    // console.log(localStorage.getItem('token'));
    localStorage.removeItem('token');
    // console.log(localStorage.getItem('token'));
    window.alert('You have been logged out of the system!');
  }
}
