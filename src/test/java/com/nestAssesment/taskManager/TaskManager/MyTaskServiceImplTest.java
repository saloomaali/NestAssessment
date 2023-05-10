package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDtoImpl;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
public class MyTaskServiceImplTest {



        @InjectMocks
        MyTaskServiceImpl myTaskService;

        @Mock
        TaskRepository taskRepository;

        @BeforeEach
        public void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        public void testViewAllTask() {
            // Create a list of tasks to be returned by the mocked repository
            List<TaskDto> tasks = new ArrayList<>();
            TaskDto task1 = new TaskDtoImpl(1, "Task 1", "TODO", null, null, 1, "Patient 1", "Location 1", 1, "Facility 1", 1, "Unit 1");
            TaskDto task2 = new TaskDtoImpl(2, "Task 2", "DONE", null, null, 2, "Patient 2", "Location 2", 2, "Facility 2", 2, "Unit 2");
            tasks.add(task1);
            tasks.add(task2);

            // Set up the mocked repository to return the list of tasks
            when(taskRepository.viewAllTasks()).thenReturn(tasks);

            // Call the service method to get the list of tasks
            List<TaskDto> result = myTaskService.viewAllTask();

            // Verify that the result is the same as the list of tasks returned by the mocked repository
            Assertions.assertEquals(tasks, result);
        }

    }


