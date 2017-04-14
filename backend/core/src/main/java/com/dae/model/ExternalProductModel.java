package com.dae.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ext_product_model")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter
public class ExternalProductModel {

}
