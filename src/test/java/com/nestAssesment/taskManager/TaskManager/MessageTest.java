package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.model.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageTest {

        @Test
        public void testMessage() {
            Message message = new Message();
            message.setMsg("Hello, world!");

            Assertions.assertEquals("Hello, world!", message.getMsg());
        }

    }


