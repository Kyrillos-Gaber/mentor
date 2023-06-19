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
        return gradeRepo.findById(id).get();
    }

    @Override
    public Grade save(Grade entity) {
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
