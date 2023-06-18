package com.kyrillos.mentor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "mentor")
public class Mentor extends BaseEntity {
    @Column(name = "name")
    private String name;

}
