package com.gida.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Product_Group")
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
