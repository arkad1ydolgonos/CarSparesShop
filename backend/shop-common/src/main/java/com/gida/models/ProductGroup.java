package com.gida.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_Group")
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = "id")
public class ProductGroup {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private Integer level;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_group_id")
    private ProductGroup parentProductGroup;
}
