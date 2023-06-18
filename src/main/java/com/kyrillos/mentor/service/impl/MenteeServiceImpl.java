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
        return null;
    }

    @Override
    public Mentee save(Mentee mentor) {
        return null;
    }

    @Override
    public Mentee update(UUID id, Mentee mentor) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public List<Mentee> getAll() {
        return null;
    }
}
