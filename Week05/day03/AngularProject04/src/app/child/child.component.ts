import { Content } from '@angular/compiler/src/render3/r3_ast';
import {
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  Component,
  ContentChild,
  DoCheck,
  Input,
  OnChanges,
  OnDestroy,
  OnInit,
  SimpleChanges,
} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent
  implements
    OnInit,
    OnDestroy,
    OnChanges,
    DoCheck,
    AfterContentInit,
    AfterContentChecked,
    AfterViewInit,
    AfterViewChecked
{
  count = 0;
  interval: any;

  @Input() userName: any;

  @ContentChild('cheader', { static: false }) celement: any;

  constructor() {
    console.log('The Constructor of Child Component is called!');
    console.log(this.celement);
  }

  ngOnInit(): void {
    console.log('OnInit function of Child Component is called!');
    // replicating the server call which will get data from the server
    // this.interval = setInterval(() => {
    //   console.log('Current value of Count is : ', this.count);
    //   this.count += 1;
    // }, 1000);
    console.log(this.celement);
  }

  ngOnDestroy(): void {
    console.log('OnDestroy function of Child Component is called!');
    clearInterval(this.interval);
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('OnChanges function of Child Component is called!');
    // console.log(changes);
  }

  ngDoCheck(): void {
    console.log('DoCheck function of Child Choponent is called!');
  }

  ngAfterContentInit(): void {
    console.log('AfterContentInit function of Child Component is called!');
    console.log(this.celement);
  }
  ngAfterContentChecked(): void {
    console.log('AfterContentChecked function of Child Component is called!');
    console.log(this.celement);
  }

  ngAfterViewInit(): void {
    console.log('AfterViewInit function of Child Component is called!');
  }
  ngAfterViewChecked(): void {
    console.log('AfterViewChecked function of Child Component is called!');
  }
}
