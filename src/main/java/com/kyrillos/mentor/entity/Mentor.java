package com.kyrillos.mentor.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Table(name = "mentor")
public class Mentor extends BaseEntity {
    @Column(name = "name")
    private String name;
    private String phone;
    private String city;
}
