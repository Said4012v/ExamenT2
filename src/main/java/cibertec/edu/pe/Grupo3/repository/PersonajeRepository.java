package cibertec.edu.pe.Grupo3.repository;

import cibertec.edu.pe.Grupo3.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository
        extends JpaRepository<Personaje, Integer> {
}
