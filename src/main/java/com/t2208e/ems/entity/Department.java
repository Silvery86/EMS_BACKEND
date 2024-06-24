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
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name")
    private String depName;

    @Column(name = "room_number")
    private String roomNo;

    @Column(name = "number_employee")
    private int numberEmployee;

    @Column(name = "chief_id")
    private Long chiefId;

    @Column(name = "deputy_1_id")
    private Long deputy1Id;

    @Column(name = "deputy_2_id")
    private Long deputy2Id;

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
