import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor() {}
  isLoggedIn() {
    // will hold the credential matching logic
    return false;
  }
}
