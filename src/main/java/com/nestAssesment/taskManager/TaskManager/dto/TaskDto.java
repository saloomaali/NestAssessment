package com.nestAssesment.taskManager.TaskManager.dto;

import java.util.Date;


public interface TaskDto {

    long getId();

    String getDescription();

    String getStatus();

    Date getDueDate();

    String getComment();

    int getPatientId();

    String getName();

    String getLocation();

    int getBed();

    String getFacility();

    int getRoom();

    String getUnitName();

}

