package com.nestAssesment.taskManager.TaskManager;
import com.nestAssesment.taskManager.TaskManager.entity.AbstractEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AbstractEntityTest {

        private AbstractEntity abstractEntity;

        @BeforeEach
        public void setUp() {
            abstractEntity = new AbstractEntity();
        }

        @Test
        public void testAbstractEntity() {
            Assertions.assertEquals(0, abstractEntity.getId());
        }

        @Test
        public void testAbstractEntityId() {
            long id = 1L;
            abstractEntity.setId(id);
            Assertions.assertEquals(id, abstractEntity.getId());
        }

    }


