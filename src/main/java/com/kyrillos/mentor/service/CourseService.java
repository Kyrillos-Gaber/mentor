package com.kyrillos.mentor.service;

import com.kyrillos.mentor.entity.Course;
import com.kyrillos.mentor.entity.Mentee;

import java.util.UUID;

public interface CourseService extends BaseService<Course>{
    void addMentor(UUID courseId, UUID mentorId);
}
