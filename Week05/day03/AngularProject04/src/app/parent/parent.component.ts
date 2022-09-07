import {
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  Component,
  DoCheck,
  OnChanges,
  OnInit,
  SimpleChanges,
  ViewChild,
} from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css'],
})
export class ParentComponent
  implements
    OnInit,
    OnChanges,
    DoCheck,
    AfterContentInit,
    AfterContentChecked,
    AfterViewInit,
    AfterViewChecked
{
  @ViewChild('pheader', { static: false }) pelement: any;
  constructor() {
    console.log('The Constructor of Parent Component is called!');
  }

  ngOnInit(): void {
    console.log('OnInit function of Parent Component is called!');
  }

  childFlag = false;
  toggleChild() {
    this.childFlag = !this.childFlag;
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log('OnChanges function of Parent Component is called!');
    console.log(this.pelement);
  }
  // Going to the child component
  userName = 'Your UserName Comes here';

  ngDoCheck(): void {
    console.log('DoCheck function of Parent Choponent is called!');
    console.log(this.pelement);
  }

  ngAfterContentInit(): void {
    console.log('AfterContentInit function of Parent Component is called!');
    console.log(this.pelement);
  }
  ngAfterContentChecked(): void {
    console.log('AfterContentChecked function of Parent Component is called!');
    console.log(this.pelement);
  }

  ngAfterViewInit(): void {
    console.log('AfterViewInit function of Parent Component is called!');
    console.log(this.pelement);
  }
  ngAfterViewChecked(): void {
    console.log('AfterViewChecked function of Parent Component is called!');
    console.log(this.pelement);
  }
}
