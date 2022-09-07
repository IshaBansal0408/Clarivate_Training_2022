import { TestBed } from '@angular/core/testing';

import { RestrictGuard } from './restrict.guard';

describe('RestrictGuard', () => {
  let guard: RestrictGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(RestrictGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
