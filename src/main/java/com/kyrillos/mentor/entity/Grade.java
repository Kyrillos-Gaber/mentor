package com.kyrillos.mentor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "grade")
public class Grade extends BaseEntity {
    private String score;

}