package com.example.listore.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Service extends GeneralModel{

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private String description;

    @ManyToOne
    @JoinColumn(name = "listore_user_id")
    private ListoreUser user;
}
