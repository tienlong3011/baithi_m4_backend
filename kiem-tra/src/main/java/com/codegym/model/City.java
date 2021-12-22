package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Data
@CrossOrigin("*")
@RequestMapping("/city")
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double area;
    private int population;
    private double gdp;
    private String description;
    @ManyToOne(targetEntity = National.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "national_id")
    private National national;
}
