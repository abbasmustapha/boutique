package com.mab.boutique.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "factures")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FactureEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String ref;
    @Column(nullable = false, name = "date_creation_facture")
    private Date date;

    //
    @ManyToOne
    private ClientEntity client;


}
