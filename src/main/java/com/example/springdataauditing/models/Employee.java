package com.example.springdataauditing.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date dateOfJoining;
    private String department;
    private double salary;

    @CreatedDate
    private Date createDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private Date lastModifiesDate;
    @LastModifiedBy
    private String modifiedBy;
}
