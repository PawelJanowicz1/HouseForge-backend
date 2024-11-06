package org.example.house_forge.client.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "name cannot be blank")
    private String firstName;

    @Pattern(regexp = "^(\\+48)?[\\s-]?\\d{3}[\\s-]?\\d{3}[\\s-]?\\d{3}$", message = "Invalid phone number format")
    private String phoneNumber;

    @NotBlank(message = "email cannot be blank")
    private String email;

    @NotBlank(message = "message cannot be blank")
    private String message;


}
