package com.kyrillos.mentor.service;

import com.kyrillos.mentor.entity.Mentor;
import com.kyrillos.mentor.repository.MentorRepository;

import java.util.List;
import java.util.UUID;

public interface MentorService {
    Mentor save(Mentor mentor);
    Mentor get(UUID id);
    List<Mentor> getAll();
    void delete(UUID id);
}
