package com.charann.JsonOutput.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class CustomerReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String customer;

    @Column
    private int custId;

    @Column
    private double amount;

    @Column
    private int points = 0;

}
