package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.dto.TaskDtoImpl;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class TaskDtoImplTest {

    @Test
    void testGettersAndSetters() {
        long id = 1L;
        String description = "Example task";
        String status = "Pending";
        Date dueDate = new Date();
        String comment = "This is a comment";
        int patientId = 2;
        String name = "John Doe";
        String location = "Room 101";
        int bed = 3;
        String facility = "Hospital";
        int room = 101;
        String unitName = "Cardiology";

        TaskDtoImpl taskDto = new TaskDtoImpl(id, description, status, dueDate, comment,
                patientId, name, location, bed, facility, room, unitName);

        assertEquals(id, taskDto.getId());
        assertEquals(description, taskDto.getDescription());
        assertEquals(status, taskDto.getStatus());
        assertEquals(dueDate, taskDto.getDueDate());
        assertEquals(comment, taskDto.getComment());
        assertEquals(patientId, taskDto.getPatientId());
        assertEquals(name, taskDto.getName());
        assertEquals(location, taskDto.getLocation());
        assertEquals(bed, taskDto.getBed());
        assertEquals(facility, taskDto.getFacility());
        assertEquals(room, taskDto.getRoom());
        assertEquals(unitName, taskDto.getUnitName());

        long newId = 2L;
        String newDescription = "New task";
        String newStatus = "Completed";
        Date newDueDate = new Date();
        String newComment = "This is a new comment";
        int newPatientId = 4;
        String newName = "Jane Smith";
        String newLocation = "Room 102";
        int newBed = 4;
        String newFacility = "Clinic";
        int newRoom = 102;
        String newUnitName = "Dermatology";

        taskDto.setId(newId);
        taskDto.setDescription(newDescription);
        taskDto.setStatus(newStatus);
        taskDto.setDueDate(newDueDate);
        taskDto.setComment(newComment);
        taskDto.setPatientId(newPatientId);
        taskDto.setName(newName);
        taskDto.setLocation(newLocation);
        taskDto.setBed(newBed);
        taskDto.setFacility(newFacility);
        taskDto.setRoom(newRoom);
        taskDto.setUnitName(newUnitName);

        assertEquals(newId, taskDto.getId());
        assertEquals(newDescription, taskDto.getDescription());
        assertEquals(newStatus, taskDto.getStatus());
        assertEquals(newDueDate, taskDto.getDueDate());
        assertEquals(newComment, taskDto.getComment());
        assertEquals(newPatientId, taskDto.getPatientId());
        assertEquals(newName, taskDto.getName());
        assertEquals(newLocation, taskDto.getLocation());
        assertEquals(newBed, taskDto.getBed());
        assertEquals(newFacility, taskDto.getFacility());
        assertEquals(newRoom, taskDto.getRoom());
        assertEquals(newUnitName, taskDto.getUnitName());
    }
}
