package com.home.project.dto;

import com.home.project.entity.Schedule;
import lombok.Data;

import java.util.List;

@Data
public class ScheduleWiseTaskDto {
    private ScheduleDto schedule;

    List<AssignedTaskDto> assignedTaskDtos;

}
