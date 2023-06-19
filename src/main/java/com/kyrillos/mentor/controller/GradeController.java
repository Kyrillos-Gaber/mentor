package com.kyrillos.mentor.controller;

import com.kyrillos.mentor.entity.Grade;
import com.kyrillos.mentor.service.GradeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/grade")
public class GradeController {
    GradeService gradeService;

    @PostMapping("/{courseId}/{menteeId}")
    public ResponseEntity<Grade> save(@PathVariable UUID courseId, @PathVariable UUID menteeId, @RequestBody Grade grade){
        return new ResponseEntity<>(gradeService.save(courseId, menteeId, grade), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Grade>> getAll(){
        return new ResponseEntity<>(gradeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> get(@PathVariable UUID id){
        return new ResponseEntity<>(gradeService.get(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grade> update(@PathVariable UUID id, @RequestBody Grade grade){
        return new ResponseEntity<>(gradeService.update(id, grade), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable UUID id){
        gradeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
