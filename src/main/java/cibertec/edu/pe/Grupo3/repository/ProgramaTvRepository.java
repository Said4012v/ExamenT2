package cibertec.edu.pe.Grupo3.repository;

import cibertec.edu.pe.Grupo3.model.ProgramaTv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaTvRepository
        extends JpaRepository<ProgramaTv, Integer> {
}
