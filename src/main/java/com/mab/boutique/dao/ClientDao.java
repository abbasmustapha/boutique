package com.mab.boutique.dao;

import com.mab.boutique.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<ClientEntity,Integer> {
    ClientEntity findByNom(String nom);
}
