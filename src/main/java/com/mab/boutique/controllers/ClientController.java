package com.mab.boutique.controllers;

import com.mab.boutique.dto.ClientRequestDto;
import com.mab.boutique.dto.ClientResponseDto;
import com.mab.boutique.service.ClientService;
import javassist.NotFoundException;
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

    @GetMapping("/id/{id}")
    public ClientResponseDto findById(@PathVariable("id") Integer id) {
        return clientService.findById(id);
    }

    @GetMapping("/nom/{nom}")
    public ClientResponseDto findByNom(@PathVariable() String nom) {
        return clientService.findByNom(nom);
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable() Integer id) {
        clientService.delete(id);
    }

    @PutMapping("/id/{id}")
    public ClientResponseDto update(@RequestBody() ClientRequestDto clientRequestDto,@PathVariable() Integer id) throws NotFoundException {
        return clientService.update(clientRequestDto, id);
    }
}
