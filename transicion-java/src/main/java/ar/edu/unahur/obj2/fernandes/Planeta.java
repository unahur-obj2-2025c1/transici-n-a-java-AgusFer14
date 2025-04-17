package ar.edu.unahur.obj2.fernandes;

import java.util.List;

public class Planeta {

    private List<Persona> personas;
    private Integer cantMuseos;
    private Integer kmMurallas;

    public Planeta(List<Persona> personas, Integer cantMuseos) {
        this.personas = personas;
        this.cantMuseos = cantMuseos;
    }

    public List<Persona> delegacionDiplomatica() {
        return personas.stream().filter(persona -> persona.esDestacado()).toList();
    }

    public Integer valorInicialDeDefensa() {
        return personas.stream().filter(persona -> persona.potencia() > 30).toList().size();
    }

    public Boolean esCulto() {
        return cantMuseos >= 2 && personas.stream().allMatch(persona -> persona.inteligencia() >= 10);
    }

    public Integer potenciaReal() {
        return personas.stream().mapToInt(persona -> persona.potencia()).sum();
    }

    public void construirMurallas(Integer km) {
        this.kmMurallas += km;
    }

    public void construirMuseo() {
        this.cantMuseos += 1;
    }

    public Integer potenciaAparente() {
        return personas.stream().mapToInt(persona -> persona.potencia()).max().orElse(0) * personas.size();
    }

    public Boolean necesitaReforzarse() {
        return potenciaAparente() > potenciaReal() * 2;
    }

    public void recibirTributo() {
        personas.forEach(persona -> persona.ofrecerTributo(this));
    }
}
