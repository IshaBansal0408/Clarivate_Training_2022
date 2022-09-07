import { RegisterComponent } from './../register/register.component';
import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  CanDeactivate,
  RouterStateSnapshot,
  UrlTree,
} from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class RestrictGuard implements CanDeactivate<RegisterComponent> {
  canDeactivate(
    component: RegisterComponent,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState?: RouterStateSnapshot
  ): boolean {
    if (component.username?.dirty || component.password?.dirty) {
      return window.confirm(
        'Your data will be deleted! Are you sure you want to go ahead?'
      );
    }
    return true;
  }
}
