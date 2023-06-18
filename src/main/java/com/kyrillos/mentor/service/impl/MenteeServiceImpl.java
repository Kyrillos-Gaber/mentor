package com.kyrillos.mentor.service.impl;

import com.kyrillos.mentor.entity.Mentee;
import com.kyrillos.mentor.repository.MenteeRepository;
import com.kyrillos.mentor.service.MenteeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class MenteeServiceImpl implements MenteeService {
    MenteeRepository menteeRepo;

    @Override
    public Mentee get(UUID id) {
        return menteeRepo.findById(id).get();
    }

    @Override
    public Mentee save(Mentee mentee) {
        return menteeRepo.save(mentee);
    }

    @Override
    public Mentee update(UUID id, Mentee mentee) {
        Mentee m = get(id);
        mentee.setCreatedAt(m.getCreatedAt());
        mentee.setId(id);
        return menteeRepo.save(mentee);
    }

    @Override
    public void delete(UUID id) {
        menteeRepo.deleteById(id);
    }

    @Override
    public List<Mentee> getAll() {
        return (List<Mentee>)menteeRepo.findAll();
    }
}
