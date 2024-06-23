package cibertec.edu.pe.Grupo3.service;

import cibertec.edu.pe.Grupo3.model.ProgramaTv;
import cibertec.edu.pe.Grupo3.repository.ProgramaTvRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProgramaTvService implements IProgramaTvService {
    private  ProgramaTvRepository programaTvRepository;

    @Override
    public List<ProgramaTv> listarProgramaTv() {
        return programaTvRepository.findAll();
    }

    @Override
    public ProgramaTv guardarProgramaTv(ProgramaTv programaTv) {
        return programaTvRepository.save(programaTv);
    }

    @Override
    public Optional<ProgramaTv> obtenerProgramaTvxId(Integer id) {
        return programaTvRepository.findById(id);
    }
}
