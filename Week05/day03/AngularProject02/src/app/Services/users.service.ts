import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UsersService {
  constructor() {}

  getEmpData() {
    return [
      { pId: 1, name: 'Olivia', designation: 'UX/UI Developer', age: 24 },
      { pId: 2, name: 'Jason', designation: 'Web Developer', age: 25 },
      { pId: 3, name: 'Gloria', designation: 'App Developer', age: 30 },
      { pId: 4, name: 'Kevin', designation: 'Tester', age: 23 },
    ];
  }
}
