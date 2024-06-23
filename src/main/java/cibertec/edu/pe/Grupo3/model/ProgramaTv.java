package cibertec.edu.pe.Grupo3.model;
import jakarta.persistence.*;


import java.util.Date;


@Entity
@Table(name = "ProgramaTv")
public class ProgramaTv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProgramaTv")
    private int idProgramaTv;

    @Column(name = "Titulo", nullable = false, length = 250)
    private String titulo;

    @Column(name = "Resumen", nullable = false, length = 250)
    private String resumen;

    @Column(name = "FechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @ManyToOne
    @JoinColumn(name = "IdPersonaje", nullable = false)
    private Personaje personaje;

    // Getters and setters
    public int getIdProgramaTv() {
        return idProgramaTv;
    }

    public void setIdProgramaTv(int idProgramaTv) {
        this.idProgramaTv = idProgramaTv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
