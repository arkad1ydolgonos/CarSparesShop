package com.gida.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = "id")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "strength")
    private Integer strength;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_group_id")
    private ProductGroup productGroup;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Product_Lnk",
            joinColumns = @JoinColumn(name = "child_product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "parent_product_id", referencedColumnName = "id"))
    private List<Product> childProducts;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Product_Lnk",
            joinColumns = @JoinColumn(name = "parent_product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "child_product_id", referencedColumnName = "id"))
    private List<Product> parentProducts;


}
