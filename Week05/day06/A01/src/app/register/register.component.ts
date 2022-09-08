import { UsersService } from './../Services/users.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  constructor(private usersService: UsersService) {}

  ngOnInit(): void {}

  regUser(form: NgForm) {
    console.log(form.value);
    this.usersService.addUser(form.value).subscribe((res) => {
      console.log(res);
    });
  }
}
