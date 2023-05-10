package com.nestAssesment.taskManager.TaskManager;

import com.nestAssesment.taskManager.TaskManager.controller.MyTaskController;
import com.nestAssesment.taskManager.TaskManager.dto.CommentDto;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDtoImpl;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import com.nestAssesment.taskManager.TaskManager.model.Message;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import com.nestAssesment.taskManager.TaskManager.service.MyTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class MyTaskControllerTest {

    @Mock
    private MyTaskService myTaskService;
    @InjectMocks
    private MyTaskController myTaskController;

    @Mock
    private TaskRepository taskRepository;

    @Mock
    private Message expectedMessage;

    @Test
    public void testViewAllTasks() {
        // Arrange
        List<TaskDto> taskDtoList = new ArrayList<>();
        taskDtoList.add(new TaskDtoImpl(1L, "Task 1", "Pending", new Date(), "", 1, "Patient 1", "Location 1", 1, "Facility 1", 1, "Unit 1"));
        taskDtoList.add(new TaskDtoImpl(2L, "Task 2", "In Progress", new Date(), "", 2, "Patient 2", "Location 2", 2, "Facility 2", 2, "Unit 2"));
        Mockito.when(myTaskService.viewAllTask()).thenReturn(taskDtoList);

        // Act
        List<TaskDto> result = myTaskController.viewAllTasks();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Task 1", result.get(0).getDescription());
        assertEquals("Task 2", result.get(1).getDescription());
    }

    @Test
    public void testUpdateComment() {
        // Arrange
        Task task = new Task();
        task.setId(1L);
        task.setComment("");
        Optional<Task> optionalTask = Optional.of(task);
        CommentDto commentDto = new CommentDto();
        commentDto.setComment("New comment");
//        Message expectedMessage = new Message();
        expectedMessage.setMsg("Comment updated successfully");
        Mockito.when(taskRepository.findById(1L)).thenReturn(optionalTask);

        // Act
        Message result = myTaskController.updateComment(1L, commentDto);

        // Assert
        assertEquals(expectedMessage.getMsg(), result.getMsg());
        assertEquals("New comment", task.getComment());
    }
}
