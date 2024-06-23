package cibertec.edu.pe.Grupo3.controller;

import cibertec.edu.pe.Grupo3.model.ProgramaTv;
import cibertec.edu.pe.Grupo3.service.IProgramaTvService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("api/programasTv")
public class ProgramaTvController {

    private final IProgramaTvService programaTvService;

    @GetMapping("")
    public ResponseEntity<List<ProgramaTv>> listarProgramasTv() {
        List<ProgramaTv> programasTv = programaTvService.listarProgramaTv();
        return ResponseEntity.ok(programasTv);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramaTv> obtenerProgramaTvPorId(@PathVariable Integer id) {
        Optional<ProgramaTv> programaTv = programaTvService.obtenerProgramaTvxId(id);
        return programaTv.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public ResponseEntity<ProgramaTv> guardarProgramaTv(@RequestBody ProgramaTv programaTv) {
        return ResponseEntity.status(HttpStatus.CREATED).body(programaTvService.guardarProgramaTv(programaTv));
    }
}

