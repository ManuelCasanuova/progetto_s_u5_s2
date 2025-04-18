package it.epicode.progetto_s_u5_s2.viaggi;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ViaggioRequest {

    @NotEmpty(message = "La destinazione è obbligatoria")
    private String destinazione;

    @NotEmpty(message = "La data è obbligatoria")
    private String data;
}
