package org.example.house_forge.client.service;

import lombok.AllArgsConstructor;
import org.example.house_forge.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

}
