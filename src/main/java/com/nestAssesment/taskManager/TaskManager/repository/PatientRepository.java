package com.nestAssesment.taskManager.TaskManager.repository;

import com.nestAssesment.taskManager.TaskManager.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
