package cibertec.edu.pe.Grupo3.service;

import cibertec.edu.pe.Grupo3.model.ProgramaTv;
import java.util.List;
import java.util.Optional;

public interface IProgramaTvService {
    List<ProgramaTv> listarProgramaTv();
    ProgramaTv guardarProgramaTv(ProgramaTv ProgramaTv);
    Optional<ProgramaTv> obtenerProgramaTvxId(Integer id);
}

