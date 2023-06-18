package com.kyrillos.mentor.service.impl;

import com.kyrillos.mentor.entity.Mentor;
import com.kyrillos.mentor.repository.MentorRepository;
import com.kyrillos.mentor.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {
    MentorRepository mentorRepo;
    @Override
    public Mentor save(Mentor mentor) {
        return mentorRepo.save(mentor);
    }

    @Override
    public Mentor update(UUID id, Mentor mentor) {
        Mentor m = get(id);
        mentor.setId(id);
        mentor.setCreatedAt(m.getCreatedAt());
        return mentorRepo.save(mentor);
    }

    @Override
    public Mentor get(UUID id) {
        return mentorRepo.findById(id).get();
    }

    @Override
    public List<Mentor> getAll() {
        return (List<Mentor>) mentorRepo.findAll();
    }

    @Override
    public void delete(UUID id) {
        mentorRepo.deleteById(id);
    }
}
