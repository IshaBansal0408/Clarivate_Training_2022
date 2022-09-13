import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Angular02';

  componentName = 'UnitTesting';

  sum(a: number, b: number) {
    return a + b;
  }
}
