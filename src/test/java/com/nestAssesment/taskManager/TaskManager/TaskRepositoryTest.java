package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDto;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDtoImpl;
import com.nestAssesment.taskManager.TaskManager.entity.Patient;
import com.nestAssesment.taskManager.TaskManager.entity.Task;
import com.nestAssesment.taskManager.TaskManager.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ExtendWith(MockitoExtension.class)
public class TaskRepositoryTest {

    @Mock
    private TaskRepository taskRepository;

    @Test
    public void shouldReturnListOfTaskDtos() {
        // given
        TaskDto task = new TaskDtoImpl();
        task.setDescription("Test task");
        task.setComment("Test comment");
        task.setStatus("Pending");



        task.setName("Test patient");
        task.setLocation("Test location");
        task.setFacility("Test facility");
        task.setUnitName("Test unit");
        task.setRoom(1);
        task.setBed(2);


        task.setPatientId(1);

        // when
        List<TaskDto> taskDtos = taskRepository.viewAllTasks();

        // then
        assertThat(taskDtos).hasSize(1);
        TaskDto taskDto = taskDtos.get(0);
        assertThat(taskDto.getId()).isEqualTo(task.getId());
        assertThat(taskDto.getDescription()).isEqualTo(task.getDescription());
        assertThat(taskDto.getComment()).isEqualTo(task.getComment());
        assertThat(taskDto.getStatus()).isEqualTo(task.getStatus());
        assertThat(taskDto.getPatientId()).isEqualTo(task.getId());
        assertThat(taskDto.getName()).isEqualTo(task.getName());
        assertThat(taskDto.getLocation()).isEqualTo(task.getLocation());
        assertThat(taskDto.getFacility()).isEqualTo(task.getFacility());
        assertThat(taskDto.getUnitName()).isEqualTo(task.getUnitName());
        assertThat(taskDto.getRoom()).isEqualTo(task.getRoom());
        assertThat(taskDto.getBed()).isEqualTo(task.getBed());
    }
}
