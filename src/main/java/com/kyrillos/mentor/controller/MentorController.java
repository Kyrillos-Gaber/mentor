package com.kyrillos.mentor.controller;

import com.kyrillos.mentor.entity.Mentor;
import com.kyrillos.mentor.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/mentor")
public class MentorController {
    MentorService mentorService;

    @PostMapping
    public ResponseEntity<Mentor> save(@RequestBody Mentor mentor){
        return new ResponseEntity<>(mentorService.save(mentor), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Mentor>> getAll(){
        return new ResponseEntity<>(mentorService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mentor> get(@PathVariable UUID id){
        return new ResponseEntity<>(mentorService.get(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mentor> update(@PathVariable UUID id, @RequestBody Mentor mentor){
        return new ResponseEntity<>(mentorService.update(id, mentor), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable UUID id){
        mentorService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
