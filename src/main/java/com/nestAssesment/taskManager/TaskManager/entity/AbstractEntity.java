package com.nestAssesment.taskManager.TaskManager.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id;
}
