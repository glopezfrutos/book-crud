package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="Magazine")
@Table(name="magazine")
@Data
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String publisher;

    private Integer numberPages;
}