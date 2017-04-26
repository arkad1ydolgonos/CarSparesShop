package com.gida.models;

import com.gida.models.enums.PositionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "position")
@Getter
@Setter
public class Position {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private PositionType name;
    @Column(name = "decription")
    private String decription;


}
