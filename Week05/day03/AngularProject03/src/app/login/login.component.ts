import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  // create object of form group
  loginForm = new FormGroup({
    userEmail: new FormControl('', [
      Validators.required,
      Validators.email,
      Validators.maxLength(20),
    ]),
    userPassword: new FormControl('', [Validators.required]),
  });

  // getters for both form control variables
  get userEmail() {
    return this.loginForm.get('userEmail');
  }
  get userPassword() {
    return this.loginForm.get('userPassword');
  }

  // Event when we click on Submit button
  loginUser() {
    // console.log(this.loginForm);
    console.log(this.loginForm.value);

    console.log('Login Successfully!');
  }
}
