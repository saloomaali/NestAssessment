package com.nestAssesment.taskManager.TaskManager.controller;

import com.nestAssesment.taskManager.TaskManager.entity.Task;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyTaskController {

    TaskRepository taskRepository;

@CrossOrigin(origins = "*")
@GetMapping("/viewAllTasks")
public List<Map<String, String>> viewTasks(){

    return taskRepository.viewAllTasks();
}

}
