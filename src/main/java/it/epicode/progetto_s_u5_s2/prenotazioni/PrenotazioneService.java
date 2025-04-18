package it.epicode.progetto_s_u5_s2.prenotazioni;

import it.epicode.progetto_s_u5_s2.entities.Dipendente;
import it.epicode.progetto_s_u5_s2.repositories.DipendenteRepository;
import it.epicode.progetto_s_u5_s2.entities.Prenotazione;
import it.epicode.progetto_s_u5_s2.viaggi.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private ViaggioService viaggioService;

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public Page<Prenotazione> findAllPrenotazioni (int page, int size, String sortBy, Long dipendenteId){
        if(dipendenteId != null){
            Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
            Dipendente dipendente = dipendeteServ
        }
    }
}
