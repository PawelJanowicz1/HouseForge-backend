package org.example.house_forge.client.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "clients_house_forge")
@Data
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 12, message = "Name cannot exceed 12 characters")
    @Pattern(regexp = "^[a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ ]+$", message = "Name can only contain letters and spaces")
    private String name;

    @Pattern(
            regexp = "^(?:\\+48\\s?\\d{3}\\s?\\d{3}\\s?\\d{3}|\\+48\\d{9}|\\d{9}|\\d{3}\\s?\\d{3}\\s?\\d{3})$",
            message = "Invalid phone number format"
    )
    private String phoneNumber;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    @Size(max = 25, message = "Email cannot exceed 25 characters")
    private String email;

    @NotBlank(message = "Message cannot be blank")
    @Size(max = 500, message = "Message cannot exceed 500 characters")
    @Pattern(regexp = "^[\\w\\s.,;:'\"-]+$", message = "Message contains invalid characters")
    private String message;


}