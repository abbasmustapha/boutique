package com.mab.boutique.controllers;

import com.mab.boutique.dto.ClientRequestDto;
import com.mab.boutique.dto.ClientResponseDto;
import com.mab.boutique.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<ClientResponseDto> getClients(){
        System.out.println("debut getClients");
        return clientService.findAll();
    }

    @PostMapping("")
    public ClientResponseDto save(@RequestBody ClientRequestDto clientRequestDto){
        return clientService.save(clientRequestDto);
    }


}
