package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;




    public class TaskTest {

        private Task task;

        @BeforeEach
        public void setUp() {
            task = new Task("Do the laundry", "Pending", "High", new Date(), "Wash with hot water", 1, Boolean.FALSE);
        }

        @Test
        public void testTaskEntity() {
            Assertions.assertEquals("Do the laundry", task.getDescription());
            Assertions.assertEquals("Pending", task.getStatus());
            Assertions.assertEquals("High", task.getPriority());
            Assertions.assertNotNull(task.getDue_date());
            Assertions.assertEquals("Wash with hot water", task.getComment());
            Assertions.assertEquals(1, task.getPatient_id());
            Assertions.assertEquals(Boolean.FALSE, task.isDeleted());
        }

    }

