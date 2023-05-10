package com.nestAssesment.taskManager.TaskManager.service;

import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTaskServiceImpl implements MyTaskService {

    @Autowired
    TaskRepository taskRepository;
    @Override
    public List<TaskDto> viewAllTask() {

        return taskRepository.viewAllTasks();
    }

}
