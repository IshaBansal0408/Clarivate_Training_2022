import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css'],
})
export class UsersComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}
  users = [
    {
      id: '001',
      name: 'Jane',
      location: 'Canada',
      salary: 34000,
      dob: new Date('4 Jul 1987'),
    },
    {
      id: '002',
      name: 'George',
      location: 'America',
      salary: 30000,
      dob: new Date('6 Sep 1999'),
    },
    {
      id: '003',
      name: 'Jack',
      location: 'Ireland',
      salary: 45000,
      dob: new Date('26 Oct 1986'),
    },
    {
      id: '004',
      name: 'Gia',
      location: 'Germany',
      salary: 25000,
      dob: new Date('19 Sep 2000'),
    },
  ];

  user01 = {
    id: '001',
    name: 'Jane',
    location: 'Canada',
    salary: 34000,
    dob: new Date('4 Jul 1987'),
  };
}
