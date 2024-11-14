package org.example.house_forge.client.controller;

import lombok.AllArgsConstructor;
import org.example.house_forge.client.model.ClientModel;
import org.example.house_forge.client.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://www.budowa-domow-trojmiasto.pl", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController("/")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping("/send-message")
    ResponseEntity<String> sendMessage(@RequestBody ClientModel clientModel){
       return clientService.sendMessage(clientModel);
    }
}
