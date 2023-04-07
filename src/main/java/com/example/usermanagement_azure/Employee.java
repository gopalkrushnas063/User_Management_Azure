package com.example.usermanagement_azure;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
    private long salary;
}
