package com.nestAssesment.taskManager.TaskManager.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
public class Message {

    String msg;

}
