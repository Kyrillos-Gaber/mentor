package com.kyrillos.mentor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "mentee")
public class Mentee extends BaseEntity{
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "mentee", cascade = CascadeType.ALL)
    private List<Grade> grades;
}
