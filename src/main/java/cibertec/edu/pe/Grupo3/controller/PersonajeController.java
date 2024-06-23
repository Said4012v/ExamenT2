package cibertec.edu.pe.Grupo3.controller;

import cibertec.edu.pe.Grupo3.model.Personaje;
import cibertec.edu.pe.Grupo3.service.PersonajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personaje")
public class PersonajeController {

    private PersonajeService personajeService;


    @GetMapping("")
    public ResponseEntity<List<Personaje>> listarPersonajes() {
        List<Personaje> personajeList = new ArrayList<>(personajeService.listarpersonaje());
        if (personajeList.isEmpty()){
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(personajeList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> obtenerPersonajePorId(@PathVariable Integer id) {
        Optional<Personaje> personaje = personajeService.obtenerPersonajexId(id);
        return personaje.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Personaje> guardarPersonaje(@RequestBody Personaje personaje) {
        Personaje nuevoPersonaje = personajeService.guardarpersonaje(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPersonaje);
    }

}
