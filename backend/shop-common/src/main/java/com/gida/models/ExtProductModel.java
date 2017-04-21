package com.gida.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ext_Product_Model")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"id"})
@ToString
public class ExtProductModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    public String description;
    @Column(name = "production_start")
    @Temporal(TemporalType.DATE)
    private Date productionStart;
    @Column(name = "production_end")
    @Temporal(TemporalType.DATE)
    private Date productionEnd;

}
