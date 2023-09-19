package com.example.listore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Buy extends GeneralModel{

    @Column(nullable = false, length = 60)
    private LocalDateTime buyDate;

    @Column(nullable = false, length = 60)
    private LocalDateTime asignedDate;

    @Column(nullable = false, length = 120)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ListoreUser user;


    public Buy() {
        this.buyDate = LocalDateTime.now();
    }
}
