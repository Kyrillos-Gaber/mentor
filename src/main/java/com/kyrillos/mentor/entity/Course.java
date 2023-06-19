package com.kyrillos.mentor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course extends BaseEntity{
    @Column(unique = true)
    private String name;
    private String hours;
    private String description;
    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Grade> grades;
    @ManyToMany
    @JoinTable(
            name = "mentor_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "mentor_id")
    )
    private Set<Mentor> mentors;
}
