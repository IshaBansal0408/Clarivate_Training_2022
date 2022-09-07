import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-persons',
  templateUrl: './persons.component.html',
  styleUrls: ['./persons.component.css'],
})
export class PersonsComponent implements OnInit {
  searchString = '';

  constructor() {}

  ngOnInit(): void {}

  users = [
    { name: 'Kate', id: '001', doj: new Date('13 Jul 2008') },
    { name: 'Ben', id: '002', doj: new Date('24 May 2018') },
    { name: 'Leon', id: '003', doj: new Date('8 Apr 1999') },
    { name: 'Harry', id: '004', doj: new Date('30 Sep 2020') },
  ];

  addUser() {
    this.users.push({
      name: 'Test',
      id: '005',
      doj: new Date('1 Jan 2000'),
    });
  }
}
