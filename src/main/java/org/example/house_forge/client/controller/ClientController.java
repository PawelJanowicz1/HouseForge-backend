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

    @CrossOrigin({"https://www.budowa-domow-trojmiasto.pl", "https://www.budowa-domow-trojmiasto.pl/api"})
    @PostMapping("/send-message")
    ResponseEntity<String> sendMessage(@RequestBody ClientModel clientModel){
       return clientService.sendMessage(clientModel);
    }
}
