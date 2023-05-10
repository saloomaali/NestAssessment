package com.nestAssesment.taskManager.TaskManager.dto;

import lombok.AllArgsConstructor;

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


    void setId(long id);

    void setDescription(String description);

    void setStatus(String status);

    void setDueDate(Date dueDate);

    void setComment(String comment);

    void setPatientId(int patientId);

    void setName(String name);

    void setLocation(String location);

    void setBed(int bed);

    void setFacility(String facility);

    void setRoom(int room);

    void setUnitName(String unitName);
}

