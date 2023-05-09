package com.nestAssesment.taskManager.TaskManager.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import java.util.Date;

@Entity
@Table(name = "task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task extends AbstractEntity{

    private String description;
    private String status;
    private String priority;
    private Date due_date;
    private String comment;
    private int patient_id;
    private boolean deleted = Boolean.FALSE;

}
