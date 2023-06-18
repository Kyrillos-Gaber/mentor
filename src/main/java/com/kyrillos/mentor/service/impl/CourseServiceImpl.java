package com.kyrillos.mentor.service.impl;

import com.kyrillos.mentor.entity.Course;
import com.kyrillos.mentor.repository.CourseRepository;
import com.kyrillos.mentor.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepo;

    @Override
    public Course get(UUID id) {
        return null;
    }

    @Override
    public Course save(Course entity) {
        return null;
    }

    @Override
    public Course update(UUID id, Course entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public List<Course> getAll() {
        return null;
    }
}
