package com.nestAssesment.taskManager.TaskManager.controller;
import com.nestAssesment.taskManager.TaskManager.dto.CommentDto;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import com.nestAssesment.taskManager.TaskManager.model.Message;
import com.nestAssesment.taskManager.TaskManager.model.Response;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MyTaskController {

    @Autowired
    MyTaskService myTaskService;

    @Autowired
    Message message;

    @Autowired
    TaskRepository taskRepository;



    @CrossOrigin(origins = "*")
    @GetMapping(path = "/mytask/view")
    public List<TaskDto> viewAllTasks(){
        return myTaskService.viewAllTask();
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/mytask/update/{id}")
    public Message updateComment(@PathVariable("id") long id, @RequestBody CommentDto commentDto){
        Optional<Task> optionalTask= taskRepository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ResourceNotFoundException("Comment not found with id " + id);
        }
        if (commentDto.getComment().length() > 100){
            message.setMsg("Comment exceeds the limit");
        }
        else {
            Task task = optionalTask.get();
            task.setComment(commentDto.getComment());
            taskRepository.save(task);
            message.setMsg("Comment updated successfully");
        }
        return message;
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleException(Exception e) {
        Response response = new Response();
        response.setStatus("failed");
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
