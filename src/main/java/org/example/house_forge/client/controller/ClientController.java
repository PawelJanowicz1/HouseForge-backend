package org.example.house_forge.client.controller;

import lombok.AllArgsConstructor;
import org.example.house_forge.client.model.ClientModel;
import org.example.house_forge.client.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @CrossOrigin({"http://localhost:4200", "https://www.budowa-domow-trojmiasto.pl", "https://budowa-domow-trojmiasto.pl"})
    @PostMapping("/send-message")
    ResponseEntity<String> sendMessage(@RequestBody ClientModel clientModel){
       return clientService.sendMessage(clientModel);
    }
}
