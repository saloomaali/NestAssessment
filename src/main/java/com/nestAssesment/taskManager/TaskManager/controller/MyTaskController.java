package com.nestAssesment.taskManager.TaskManager.controller;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskService;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyTaskController {

    @Autowired
    MyTaskServiceImpl myTaskServiceImpl;



@CrossOrigin(origins = "*")
@GetMapping("/viewAllTasks")
public List<Map<String, String>> viewTasks(){

    return myTaskServiceImpl.viewAllTask();
}

@CrossOrigin(origins = "*")
@PostMapping(path = "/updateComment", consumes = "application/json",produces = "application/json")
public Map<String, String> updateComment(){

    return null;
}

}
