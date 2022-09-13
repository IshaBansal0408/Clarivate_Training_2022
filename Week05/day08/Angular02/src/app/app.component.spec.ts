import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [AppComponent],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'Angular02'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('Angular02');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain(
      'Angular02 app is running!'
    );
  });

  it('testing of componentName field', () => {
    // defination of test case

    // fixture - Create reference of the component using TestBed
    const fixture = TestBed.createComponent(AppComponent);
    // component instance
    const app = fixture.componentInstance;
    // check value of the field
    expect(app.componentName).toBe('UnitTesting');
  });

  it('testing of Sum Method', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.sum(2, 4)).toBe(6);
  });

  it('Testing of Heading', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const element = fixture.nativeElement;
    expect(element.querySelector('.heading').textContent).toContain(
      'I am Heading'
    );
  });
});
