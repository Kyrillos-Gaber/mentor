package com.kyrillos.mentor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "mentor")
public class Mentor extends BaseEntity {
    @Column(name = "name")
    private String name;
    private String phone;
    private String city;
    @JsonIgnore
    @ManyToMany(mappedBy = "mentors")
    private Set<Course> courses;
}
