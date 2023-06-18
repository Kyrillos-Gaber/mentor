package com.kyrillos.mentor.controller;

import com.kyrillos.mentor.entity.Mentee;
import com.kyrillos.mentor.service.MenteeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/mentee")
public class MenteeController {
    MenteeService menteeService;

    @PostMapping
    public ResponseEntity<Mentee> save(@RequestBody Mentee mentee){
        return new ResponseEntity<>(menteeService.save(mentee), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Mentee>> getAll(){
        return new ResponseEntity<>(menteeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mentee> get(@PathVariable UUID id){
        return new ResponseEntity<>(menteeService.get(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mentee> update(@PathVariable UUID id, @RequestBody Mentee mentee){
        return new ResponseEntity<>(menteeService.update(id, mentee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable UUID id){
        menteeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
