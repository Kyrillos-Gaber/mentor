package com.kyrillos.mentor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "grade")
public class Grade extends BaseEntity {
    private String score;

    // many grades to one student
    @ManyToOne(optional = false)
    @JoinColumn(name = "mentee_id", referencedColumnName = "id")
    private Mentee mentee;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
}
