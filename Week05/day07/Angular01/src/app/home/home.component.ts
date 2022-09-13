import { Component, OnDestroy, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { filter } from 'rxjs/operators';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit, OnDestroy {
  count = 0;
  private subscription: any;
  constructor() {}

  ngOnInit(): void {
    // Creating one promise object
    const promise = new Promise((resolve) => {
      console.log('Welcome to Promise object');

      setTimeout(() => {
        resolve('Data 1 from the promise object has arrived.');
        resolve('Data 2 from the promise object has arrived.');
        resolve('Data 3 from the promise object has arrived.');
        resolve('Data 4 from the promise object has arrived.');
        resolve('Data 5 from the promise object has arrived.');
      }, 1000);
    });
    // Listen to the Promise
    promise.then((result) => {
      console.log(result);
    });

    // Creating one Observable object
    const observable = new Observable((sub) => {
      console.log('Welcome to Observable Object.');

      setTimeout(() => {
        // sub.next('Data from the observable object has arrived.');
        // sub.next('Data ' + this.count++ + ' from the Observable Object');
        sub.next('Data 1 from the observable object has arrived.');
        sub.next('Data 2 from the observable object has arrived.');
        sub.next('Data 3 from the observable object has arrived.');
        sub.next('Data 4 from the observable object has arrived.');
        sub.next('Data 5 from the observable object has arrived.');
      }, 1000);
    });
    // Listen to Observable
    this.subscription = observable
      .pipe(
        filter((d) => d === 'Data 3 from the observable object has arrived.')
      )
      .subscribe((result) => {
        console.log(result);
      });
  }

  ngOnDestroy(): void {
    console.log('This home component has been destroyed.');
    this.subscription.unsubscribe();
  }
}
