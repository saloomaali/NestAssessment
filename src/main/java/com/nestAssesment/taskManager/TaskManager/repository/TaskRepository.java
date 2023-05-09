package com.nestAssesment.taskManager.TaskManager.repository;

import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


        @Query(value = "SELECT t.id as id, t.description as description, t.comment as comment, t.status as status, t.due_date as dueDate," +
                " t.patient_id as patientId, p.name as name, p.location as location, p.facility as facility, p.unit_name as unitName," +
                " p.room as room, p.bed as bed FROM Task t JOIN Patient p ON t.patient_id = p.id WHERE t.deleted = 0", nativeQuery = true)
        List<TaskDto> viewAllTasks();

    }

