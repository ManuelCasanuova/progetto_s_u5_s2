package it.epicode.progetto_s_u5_s2.prenotazioni;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrenotazioneRequest {

    private String preferenza;

    @NotNull(message = "L'id del viaggio deve essere inserito")
    private Long viaggioId;

    @NotNull(message = "L'id del dipendente deve essere inserito")
    private Long dipendenteId;



}
