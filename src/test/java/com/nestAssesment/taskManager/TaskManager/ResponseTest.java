package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.model.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class ResponseTest {

        @Test
        public void testResponse() {
            Response response = new Response();
            response.setMessage("Task created successfully.");
            response.setStatus(HttpStatus.OK.toString());

            Assertions.assertEquals("Task created successfully.", response.getMessage());
            Assertions.assertEquals(HttpStatus.OK.toString(), response.getStatus());
        }

    }


