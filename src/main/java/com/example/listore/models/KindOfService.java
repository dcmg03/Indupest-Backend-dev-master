package com.example.listore.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class KindOfService extends GeneralModel{
    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private BigDecimal value;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
}
