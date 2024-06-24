package com.t2208e.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

    @Column(name="identity_id_number", nullable = false, unique = true)
    private String identityIdNo;

    @Column(name="birth_day")
    private Date birthDay;

    @Column(name="address")
    private String address;

    @Column(name="base_salary")
    private int baseSalary;

    @Column(name="net_salary")
    private int netSalary;

    @Column(name="insurance_base")
    private int insuraceBase;

    @Column(name="department_id")
    private int departmentId;

    @Column(name = "position")
    private String position;

    // common field
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_time")
    private Date createdTime;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_time")
    private Date updatedTime;
    @Transient
    private String attribute;

    @PrePersist
    public void prePersist(){
        this.createdTime = new Date();
        this.updatedTime = new Date();
    }
    @PreUpdate
    public void preUpdate(){
        this.createdTime = new Date();
        this.updatedTime = new Date();
    }
}
