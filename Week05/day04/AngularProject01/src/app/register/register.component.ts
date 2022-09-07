import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  regForm = new FormGroup({
    username: new FormControl('', []),
    password: new FormControl('', []),
  });
  get username() {
    return this.regForm.get('username');
  }
  get password() {
    return this.regForm.get('password');
  }
  registerUser() {
    console.log(this.regForm.value);
  }
}
