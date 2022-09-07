import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './users/users.component';
import { CalAgePipe } from './Pipes/cal-age.pipe';
import { SlicePipe } from './Pipes/slice.pipe';
import { PersonsComponent } from './persons/persons.component';
import { FormsModule } from '@angular/forms';
import { FilterPipe } from './Pipes/filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    CalAgePipe,
    SlicePipe,
    PersonsComponent,
    FilterPipe,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
