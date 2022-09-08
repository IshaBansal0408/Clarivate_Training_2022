import { Component, OnInit } from '@angular/core';
import { TodoServiceService } from '../Services/todo-service.service';

@Component({
  selector: 'app-todo-list-board',
  templateUrl: './todo-list-board.component.html',
  styleUrls: ['./todo-list-board.component.css'],
})
export class TodoListBoardComponent implements OnInit {
  constructor(private service: TodoServiceService) {}
  allTasks: any;
  flagstatusTask = false;
  flagAllTask = true;

  ngOnInit(): void {
    this.allTasks = this.service.getData().subscribe((res) => {
      this.allTasks = res;
      console.log(res);
    });
  }

  statusTasks: any[] = [];

  showIncomplete() {
    this.statusTasks = [];
    for (let t of this.allTasks) {
      if (t['completed'] == false) {
        if (t != null) this.statusTasks.push(t);
      }
    }
    this.flagstatusTask = true;
    this.flagAllTask = false;
  }

  showCompleteTasks() {
    this.statusTasks = [];
    for (let t of this.allTasks) {
      if (t['completed'] == true) {
        if (t != null) this.statusTasks.push(t);
      }
    }
    this.flagstatusTask = true;
    this.flagAllTask = false;
  }

  showAllTasks() {
    this.flagstatusTask = false;
    this.flagAllTask = true;
  }
}
