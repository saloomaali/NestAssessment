package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.dto.CommentDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommentDtoTest {


        @Test
        public void testCommentDto() {
            CommentDto commentDto = new CommentDto();
            commentDto.setComment("This is a comment");

            Assertions.assertEquals("This is a comment", commentDto.getComment());
        }

    }


