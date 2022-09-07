import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'calAge',
})
export class CalAgePipe implements PipeTransform {
  transform(value: any): any {
    var curYear = new Date().getFullYear();
    var uYear = new Date(value).getFullYear();
    return curYear - uYear;
  }
}
