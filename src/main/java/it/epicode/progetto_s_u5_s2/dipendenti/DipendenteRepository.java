package it.epicode.progetto_s_u5_s2.dipendenti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

  boolean existsByEmail(String email);

  boolean existByUsername(String username);
}
