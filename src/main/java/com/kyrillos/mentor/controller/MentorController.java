package com.kyrillos.mentor.controller;

import com.kyrillos.mentor.entity.Mentor;
import com.kyrillos.mentor.service.MentorService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/mentor")
public class MentorController {
    MentorService mentorService;

    @PostMapping
    public ResponseEntity<Mentor> save(@RequestBody Mentor mentor){
        return new ResponseEntity<>(mentorService.save(mentor), HttpStatus.OK);
    }
}
