package cibertec.edu.pe.Grupo3.service;

import cibertec.edu.pe.Grupo3.model.Personaje;
import cibertec.edu.pe.Grupo3.repository.PersonajeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonajeService implements IPersonajeService {
    private  PersonajeRepository personajeRepository;

    @Override
    public List<Personaje> listarpersonaje() {
        return personajeRepository.findAll();
    }

    @Override
    public Personaje guardarpersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @Override
    public Optional<Personaje> obtenerPersonajexId(Integer id) {
        Optional<Personaje> personaje = personajeRepository.findById(id);
        if(personaje.isEmpty()) {
            return Optional.empty();
        }
        return personaje;
    }
}
