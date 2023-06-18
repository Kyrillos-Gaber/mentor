package com.kyrillos.mentor.repository;

import com.kyrillos.mentor.entity.Grade;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface GradeRepository extends CrudRepository<Grade, UUID> {
}
