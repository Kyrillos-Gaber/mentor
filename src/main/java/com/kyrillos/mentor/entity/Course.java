package com.kyrillos.mentor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course extends BaseEntity{
    @Column(unique = true)
    private String name;
    private String hours;
}
