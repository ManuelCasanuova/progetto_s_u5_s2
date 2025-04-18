package it.epicode.progetto_s_u5_s2.viaggi;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "viaggi")

public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long viaggioId;

    @Column(nullable = false, length = 50)
    private String destinazione;

    @Column(nullable = false)
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private StatoViaggio statoViaggio;


    public Viaggio(String destinazione, StatoViaggio statoViaggio) {
        this.destinazione = destinazione;
        this.statoViaggio = StatoViaggio.IN_PROGRAMMA;
    }

    @Override
    public String toString() {
        return "Viaggio: " + + viaggioId + '\n' +
                "Destinazione: " + destinazione + '\n' +
                "Data: " + data + '\n' +
                "Stato del viaggio: " + statoViaggio;

    }
}