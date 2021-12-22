package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "national")
@RequestMapping("/national")
@NoArgsConstructor
@AllArgsConstructor
public class National {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(targetEntity = City.class, mappedBy = "national")
    @JsonIgnore
    private List<City> cities;
}