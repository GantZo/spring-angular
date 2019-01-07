import {HttpClient} from "@angular/common/http";
import {EventEmitter, Injectable} from '@angular/core';
import {Task} from "./task.model";

@Injectable()
export class TaskService {

    onTaskAdded = new EventEmitter<Task>();

    constructor(private http: HttpClient) {

    }

    getTasks() {
        return this.http.get('/api/tasks');
    }

    saveTask(task: Task, completed: boolean) {
        task.completed = completed;
        return this.addTask(task);
    }

    addTask(task: Task) {
        return this.http.post('/api/tasks/save', task);
    }
}
