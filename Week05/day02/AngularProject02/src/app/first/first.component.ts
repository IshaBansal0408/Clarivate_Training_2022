import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css'],
})
export class FirstComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  // Interpolation
  variable01 = 'Interpolation Variable';
  // Property Binding
  placeholderText = 'I am a placeholder text';
  // Style Binding
  color01 = 'red';
  colorFlag = false;
  color02 = 'purple';
  // Attribute Binding
  colpanVar = 2;
  // Event Binding
  displayName() {
    console.log('This is event Binding event!');
  }
  // Two Way Binding
  testTwoWay = 'This is Two Way Binding';
}
