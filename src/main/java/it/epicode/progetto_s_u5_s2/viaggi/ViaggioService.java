package it.epicode.progetto_s_u5_s2.viaggi;

import it.epicode.progetto_s_u5_s2.Common.CommonResponse;
import it.epicode.progetto_s_u5_s2.entities.Dipendente;
import it.epicode.progetto_s_u5_s2.entities.Prenotazione;
import it.epicode.progetto_s_u5_s2.entities.Viaggio;
import it.epicode.progetto_s_u5_s2.prenotazioni.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;

    @Autowired
    private DipendentiService dipendentiService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    public Page<Prenotazione> findAllPrenotazioni(int page, int size, String sortBy, Long dipendenteId){
        if(dipendenteId != null){
            Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
            Dipendente dipendente = dipendentiService.findDipendenteById(dipendenteId);
            return prenotazioneService.findByDipendente(dipendente, pageable);
        }
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return prenotazioneService.findAll(pageable);

    }



}
