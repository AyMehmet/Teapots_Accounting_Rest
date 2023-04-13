package com.cydeo.entity;

import com.cydeo.entity.common.BaseEntity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Table(name = "categories")
@Entity
public class Category extends BaseEntity {

    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
