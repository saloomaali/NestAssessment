package com.nestAssesment.taskManager.TaskManager.repository;

import com.nestAssesment.taskManager.TaskManager.entity.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface TaskRepository extends CrudRepository<Task, Integer> {

        @Query(value = "SELECT `description`, `comment`, `status`, `due_date`, `patient_id`, `deleted`, p.facility, p.id,p.name, p.room,p.bed, p.unit_name FROM `task` JOIN patient p ON p.id = patient_id WHERE deleted = FALSE ", nativeQuery = true)
        List<Map<String, String>> viewAllTasks();

    }

