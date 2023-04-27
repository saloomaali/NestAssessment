package com.nestAssesment.taskManager.TaskManager.controller;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskService;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public HashMap<String, String> updateComment(@RequestBody Task task){

        myTaskServiceImpl.updateComment(task.getComment(), task.getPatient_id(), task.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
}

}
