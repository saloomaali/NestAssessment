package com.nestAssesment.taskManager.TaskManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDtoImpl implements TaskDto {
    private long id;
    private String description;
    private String status;
    private Date dueDate;
    private String comment;
    private int patientId;
    private String name;
    private String location;
    private int bed;
    private String facility;
    private int room;
    private String unitName;
}
