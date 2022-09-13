import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UsersService {
  constructor() {}

  mul(a: number, b: number) {
    return a * b;
  }
}
