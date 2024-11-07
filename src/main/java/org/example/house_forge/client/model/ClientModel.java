package org.example.house_forge.client.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "clients_house_forge")
@Data
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name cannot be blank")
    private String name;

    @Pattern(regexp = "^(\\+48)?[\\s-]?\\d{3}[\\s-]?\\d{3}[\\s-]?\\d{3}$", message = "Invalid phone number format")
    private String phoneNumber;

    @NotBlank(message = "email cannot be blank")
    @Email
    private String email;

    @NotBlank(message = "message cannot be blank")
    private String message;


}
