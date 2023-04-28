package com.nestAssesment.taskManager.TaskManager.service;

import com.nestAssesment.taskManager.TaskManager.entity.TaskList;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MyTaskServiceImpl implements MyTaskService {

    @Autowired
    TaskRepository taskRepository;
    @Override
    public TaskList viewAllTask() {
        return taskRepository.viewAllTasks();
    }

    @Override
    public void updateComment() {



    }

}
