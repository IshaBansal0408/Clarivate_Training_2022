import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  person_data = [
    { name: 'Isha', id: '001', designation: 'Developer' },
    { name: 'Kartik', id: '002', designation: 'Developer' },
    { name: 'Binisha', id: '003', designation: 'Tester' },
    { name: 'Aakriti', id: '004', designation: 'Tester' },
    { name: 'Veena', id: '005', designation: 'Tech Lead' },
  ];

  selectedCountry: any;
  flag = true;
  flag2 = false;
}
