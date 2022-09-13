import {
  Directive,
  ElementRef,
  Renderer2,
  OnInit,
  HostListener,
  HostBinding,
} from '@angular/core';

@Directive({
  selector: '[appUserStyle]',
})
export class UserStyleDirective implements OnInit {
  @HostBinding('style.backgroundColor') color: string | undefined;

  // dependency injection
  constructor(private elementRef: ElementRef, private renderer2: Renderer2) {
    elementRef.nativeElement.style.color = 'yellow';
  }
  ngOnInit(): void {
    // this.renderer2.setStyle(
    //   this.elementRef.nativeElement,
    //   'background-color',
    //   'blue'
    // );
  }

  @HostListener('mouseenter') onMouseOver(event: Event) {
    this.renderer2.setStyle(
      this.elementRef.nativeElement,
      'background-color',
      'blue'
    );
  }

  @HostListener('mouseleave') onMouseLeave(event: Event) {
    // this.renderer2.setStyle(
    //   this.elementRef.nativeElement,
    //   'background-color',
    //   'black'
    // );

    this.color = 'violet';
  }
}
