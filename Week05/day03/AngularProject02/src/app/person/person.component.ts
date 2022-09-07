import { UsersService } from './../Services/users.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
})
export class PersonComponent implements OnInit {
  personsList: any;
  constructor(private personService: UsersService) {}

  ngOnInit(): void {
    this.personsList = this.personService.getEmpData();
  }
}
