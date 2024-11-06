package org.example.sellingHouses.client.service;

import lombok.AllArgsConstructor;
import org.example.sellingHouses.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

}
