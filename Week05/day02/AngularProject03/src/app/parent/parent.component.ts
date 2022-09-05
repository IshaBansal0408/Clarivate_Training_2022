import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css'],
})
export class ParentComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  // create a variable in parent
  parentValue = 'Parent';

  result: any;
  getChildData(data: any) {
    this.result = data;
    console.log(data);
  }
}
