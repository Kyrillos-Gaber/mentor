package com.kyrillos.mentor.service.impl;

import com.kyrillos.mentor.entity.Grade;
import com.kyrillos.mentor.repository.GradeRepository;
import com.kyrillos.mentor.service.GradeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {
    GradeRepository gradeRepo;

    @Override
    public Grade get(UUID id) {
        return null;
    }

    @Override
    public Grade save(Grade entity) {
        return null;
    }

    @Override
    public Grade update(UUID id, Grade entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public List<Grade> getAll() {
        return null;
    }
}
