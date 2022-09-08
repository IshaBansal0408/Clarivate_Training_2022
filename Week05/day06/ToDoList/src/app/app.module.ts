import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoListBoardComponent } from './todo-list-board/todo-list-board.component';

import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [AppComponent, TodoListBoardComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
