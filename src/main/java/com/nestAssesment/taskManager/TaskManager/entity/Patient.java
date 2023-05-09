package com.nestAssesment.taskManager.TaskManager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends AbstractEntity{

    private String name;
    private int age;
    private String location;
    private int bed;
    private String facility;
    private int room;
    private String physician_name;
    private String unit_name;
    private boolean deleted = Boolean.FALSE;

}
