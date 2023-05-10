package com.nestAssesment.taskManager.TaskManager;

import com.nestAssesment.taskManager.TaskManager.entity.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PatientTest {

    private Patient patient;

    @BeforeEach
    public void setUp() {
        patient = new Patient("John Doe", 35, "California", 101, "ABC Hospital", 201, "Dr. Smith", "Cardiology", Boolean.FALSE);
    }

    @Test
    public void testPatientEntity() {
        Assertions.assertEquals("John Doe", patient.getName());
        Assertions.assertEquals(35, patient.getAge());
        Assertions.assertEquals("California", patient.getLocation());
        Assertions.assertEquals(101, patient.getBed());
        Assertions.assertEquals("ABC Hospital", patient.getFacility());
        Assertions.assertEquals(201, patient.getRoom());
        Assertions.assertEquals("Dr. Smith", patient.getPhysician_name());
        Assertions.assertEquals("Cardiology", patient.getUnit_name());
        Assertions.assertEquals(Boolean.FALSE, patient.isDeleted());
    }

}
