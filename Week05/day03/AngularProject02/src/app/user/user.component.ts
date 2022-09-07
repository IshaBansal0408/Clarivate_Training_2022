import { UsersService } from './../Services/users.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent implements OnInit {
  personsList: any;
  constructor(private userService: UsersService) {}

  ngOnInit(): void {
    this.personsList = this.userService.getEmpData();
  }
}
