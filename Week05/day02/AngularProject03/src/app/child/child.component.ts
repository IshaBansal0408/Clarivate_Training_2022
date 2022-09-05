import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}
  // @Input transfers data from Parent to Child
  // @Input() <newVarName>: <datatype>
  @Input() childValue: any;

  // create an output variable
  @Output() childVar: EventEmitter<string> = new EventEmitter<string>();

  child2parent() {
    this.childVar.emit('This is the value from Child to Parent');
  }
}
