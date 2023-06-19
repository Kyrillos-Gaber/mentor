package com.kyrillos.mentor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
}
