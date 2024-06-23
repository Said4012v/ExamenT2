package cibertec.edu.pe.Grupo3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Personaje")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersonaje")
    private int idPersonaje;

    @Column(name = "NomPersonaje", nullable = false, length = 50)
    private String nomPersonaje;

    @Column(name = "ApePersonaje", nullable = false, length = 50)
    private String apePersonaje;

    @Column(name = "FechNacPersonaje", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechNacPersonaje;

    }
