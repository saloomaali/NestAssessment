package com.nestAssesment.taskManager.TaskManager.repository;

import com.nestAssesment.taskManager.TaskManager.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface TaskRepository extends JpaRepository<Task, Long> {


        @Query(value = "SELECT t.description, t.comment, t.status, t.priority, t.due_date, t.patient_id, t.deleted, p.id, p.name, p.location, p.facility, p.unit_name, p.room, p.bed FROM task t JOIN patient p ON patient_id = p.id WHERE t.deleted = 0 ", nativeQuery = true)
        List<Map<String, String>> viewAllTasks();

        @Transactional
        @Modifying
        @Query(value = "UPDATE task SET comment = :comment WHERE patient_id = :patient_id AND id = :id", nativeQuery = true)
        void update(@Param("comment") String comment, @Param("patient_id") int patient_id, @Param("id") long id);
    }

