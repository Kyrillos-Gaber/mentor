package com.kyrillos.mentor.service;

import com.kyrillos.mentor.entity.Mentee;

import java.util.List;
import java.util.UUID;

public interface BaseService<T> {
    T get(UUID id);
    T save(T entity);
    T update(UUID id, T entity);
    void delete(UUID id);
    List<T> getAll();
}
