package com.gida.models;

import com.gida.models.enums.PositionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Position")
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
