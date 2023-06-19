package com.kyrillos.mentor.service;

import com.kyrillos.mentor.entity.Grade;
import com.kyrillos.mentor.entity.Mentee;

import java.util.UUID;

public interface GradeService extends BaseService<Grade>{
    Grade save(UUID courseId, UUID menteeId, Grade entity);
}
