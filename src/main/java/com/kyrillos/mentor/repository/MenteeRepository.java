package com.kyrillos.mentor.repository;

import com.kyrillos.mentor.entity.Mentee;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MenteeRepository extends CrudRepository<Mentee, UUID> {
}
