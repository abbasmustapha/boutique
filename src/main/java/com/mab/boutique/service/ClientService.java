package com.mab.boutique.service;

import com.mab.boutique.dto.ClientRequestDto;
import com.mab.boutique.dto.ClientResponseDto;

public interface ClientService {

    ClientResponseDto save(ClientRequestDto clientRequestDto);

    ClientResponseDto findById(Integer id);

    ClientResponseDto findByNom(String nom);

    void delete(Integer id);

    ClientResponseDto update(ClientRequestDto clientRequestDto,Integer id);
}
