package com.kyrillos.mentor.controller;

import com.kyrillos.mentor.entity.Course;
import com.kyrillos.mentor.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> save(@RequestBody Course course){
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAll(){
        return new ResponseEntity<>(courseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> get(@PathVariable UUID id){
        return new ResponseEntity<>(courseService.get(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> update(@PathVariable UUID id, @RequestBody Course course){
        return new ResponseEntity<>(courseService.update(id, course), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable UUID id){
        courseService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
