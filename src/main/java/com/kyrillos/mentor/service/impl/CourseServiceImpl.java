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
        return courseRepo.findById(id).get();
    }

    @Override
    public Course save(Course entity) {
        return courseRepo.save(entity);
    }

    @Override
    public Course update(UUID id, Course entity) {
        Course course = get(id);
        entity.setId(id);
        entity.setCreatedAt(course.getCreatedAt());
        return courseRepo.save(entity);
    }

    @Override
    public void delete(UUID id) {
        courseRepo.deleteById(id);
    }

    @Override
    public List<Course> getAll() {
        return (List<Course>) courseRepo.findAll();
    }
}
