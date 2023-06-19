package com.kyrillos.mentor.service.impl;

import com.kyrillos.mentor.entity.Grade;
import com.kyrillos.mentor.repository.GradeRepository;
import com.kyrillos.mentor.service.CourseService;
import com.kyrillos.mentor.service.GradeService;
import com.kyrillos.mentor.service.MenteeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {
    GradeRepository gradeRepo;
    MenteeService menteeService;
    CourseService courseService;

    @Override
    public Grade get(UUID id) {
        return gradeRepo.findById(id).get();
    }

    @Override
    public Grade save(Grade entity) {
        return gradeRepo.save(entity);
    }

    @Override
    public Grade save(UUID courseId, UUID menteeId, Grade entity) {
        entity.setMentee(menteeService.get(menteeId));
        entity.setCourse(courseService.get(courseId));
        return gradeRepo.save(entity);
    }

    @Override
    public Grade update(UUID id, Grade entity) {
        Grade g = get(id);
        entity.setId(id);
        entity.setCreatedAt(g.getCreatedAt());
        return gradeRepo.save(entity);
    }

    @Override
    public void delete(UUID id) {
        gradeRepo.deleteById(id);
    }

    @Override
    public List<Grade> getAll() {
        return (List<Grade>)gradeRepo.findAll();
    }
}
