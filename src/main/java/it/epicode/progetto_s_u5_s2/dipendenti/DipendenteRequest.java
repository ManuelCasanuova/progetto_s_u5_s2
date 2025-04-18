package it.epicode.progetto_s_u5_s2.dipendenti;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DipendenteRequest {

    @NotEmpty(message = "Il nome è obbligatorio")
    private String nome;

    @NotEmpty(message = "Il cognome è obbligatorio")
    private String cognome;

    @NotEmpty(message = "L'email è obbligatoria")
    private String email;

    @NotEmpty(message = "L'username è obbligatorio")
    private String username;

}
