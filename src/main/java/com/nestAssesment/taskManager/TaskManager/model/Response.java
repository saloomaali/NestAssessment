package com.nestAssesment.taskManager.TaskManager.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response {

    private String message;
    private String status;
}
