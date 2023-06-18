package com.kyrillos.mentor.repository;

import com.kyrillos.mentor.entity.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface MentorRepository extends CrudRepository<Mentor, UUID> {
}
