package it.epicode.progetto_s_u5_s2.dipendenti;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendentiService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dipendente> findAllDipendenti() {
        return dipendenteRepository.findAll();
    }

    public Dipendente findDipendenteById(Long dipendenteId) {
        return dipendenteRepository.findById(dipendenteId)
                .orElseThrow(()-> new EntityNotFoundException());
    }


}
