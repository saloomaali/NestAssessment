package com.nestAssesment.taskManager.TaskManager.service;

import java.util.List;
import java.util.Map;

public interface MyTaskService {

    List<Map<String, String>> viewAllTask();
    void updateComment(String comment, int patient_id, long id);

}
