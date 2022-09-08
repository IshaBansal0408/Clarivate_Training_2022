import { UsersService } from './../Services/users.service';
import { NgForm } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor(private userServices: UsersService) {}

  ngOnInit(): void {}

  productData: any;
  loginUser(form: NgForm) {
    console.log(form.value);
    this.userServices.loginUser(form.value).subscribe((res) => {
      console.log(res);
      this.productData = res;
      // Save token in local storage
      console.log(this.productData.token);
      localStorage.setItem('token', this.productData.token);
    });
  }
}
