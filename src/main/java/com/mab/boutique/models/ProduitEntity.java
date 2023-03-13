package com.mab.boutique.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProduitEntity implements Serializable {

    private static final long serialVersionUID = -7275079172834495736L;

    @Id
    private Integer id;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false)
    private String ref;

    @Column(nullable = false)
    private BigDecimal prix;

    @Column(nullable = false)
    private double quantite_stock;

    @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LigneFactureEntity> ligneFactures;

}
