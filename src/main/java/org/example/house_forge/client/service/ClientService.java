package org.example.house_forge.client.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.house_forge.client.model.ClientModel;
import org.example.house_forge.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final JavaMailSenderImpl mailSender;

    @Value("${admin.email}")
    private String fromToEmail;

    public ResponseEntity<String> sendMessage(ClientModel clientModel) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(fromToEmail);
        simpleMailMessage.setTo(fromToEmail);

        String name = clientModel.getName();
        String email = clientModel.getEmail();
        String phoneNumber = clientModel.getPhoneNumber();
        String message = clientModel.getMessage();

        simpleMailMessage.setSubject(name + " próbuje się z tobą skontaktować");

        StringBuilder sb = new StringBuilder();

        sb.append("Imię: " + name).append("\nEmail: " + email).append("\nNumer telefonu: " + phoneNumber).append("\nTreść wiadomości: " + message);
        simpleMailMessage.setText(sb.toString());
        mailSender.send(simpleMailMessage);

        ClientModel newClientModel = new ClientModel();

        newClientModel.setName(clientModel.getName());
        newClientModel.setEmail(clientModel.getEmail());
        if (clientModel.getPhoneNumber() != null && !clientModel.getPhoneNumber().isEmpty()) {
            newClientModel.setPhoneNumber(clientModel.getPhoneNumber());
        } else {
            newClientModel.setPhoneNumber(null);
        }
        newClientModel.setMessage(clientModel.getMessage());
        clientRepository.save(newClientModel);
        return ResponseEntity.ok("Your message was send successfully!");
    }
}