package it.epicode.progetto_s_u5_s2.prenotazioni;

import it.epicode.progetto_s_u5_s2.dipendenti.Dipendente;
import it.epicode.progetto_s_u5_s2.viaggi.Viaggio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "prenotazioni")

public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long prenotazioneId;

    @Column(nullable = false)
    private LocalDate dataRichiesta;

    @Column(nullable = false, length = 50)
    private String preferenza;

    @OneToOne
    @JoinColumn(name = "viaggio_id")
    private Viaggio viaggio;


    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;

    public Prenotazione(Viaggio viaggio, Dipendente dipendente) {
        this.viaggio = viaggio;
        this.dipendente = dipendente;
        this.dataRichiesta = LocalDate.now();
    }


}