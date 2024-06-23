package cibertec.edu.pe.Grupo3.service;

import cibertec.edu.pe.Grupo3.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface IPersonajeService {
    List<Personaje> listarpersonaje();
    Personaje guardarpersonaje(Personaje personaje);
    Optional<Personaje> obtenerPersonajexId(Integer id);
}

