package com.gida.models;

import com.gida.models.enums.ContactType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = "id")
public class Contact {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ContactType contactType;
    @Column(name = "value")
    private String value;
    @Column(name = "description")
    private String description;
}
