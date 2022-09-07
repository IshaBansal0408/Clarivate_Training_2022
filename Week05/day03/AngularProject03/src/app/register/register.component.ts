import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  RegisterUser(form: NgForm) {
    // console.log(form);
    console.log(form.value);
    console.log('Registeration Complete!');
  }
}
