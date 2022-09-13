import { TestBed } from '@angular/core/testing';

import { UsersService } from './users.service';

describe('UsersService', () => {
  it('Testing the mul Method', () => {
    const user = new UsersService();
    let result = user.mul(2, 3);
    expect(result).toBe(6);
  });
});
