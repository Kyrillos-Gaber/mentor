package com.kyrillos.mentor.repository;

import com.kyrillos.mentor.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CourseRepository extends CrudRepository<Course, UUID> {
}
