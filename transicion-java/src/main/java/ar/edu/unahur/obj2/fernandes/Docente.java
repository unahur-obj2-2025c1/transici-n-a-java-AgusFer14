package ar.edu.unahur.obj2.fernandes;

public class Docente extends Persona {
    
    private Integer cursoDados = 0;

    public Docente(Integer edad) {
        super(edad);
    }

    @Override
    public Integer inteligencia() {
        return super.inteligencia() + (cursoDados * 2);
    }

    @Override
    public Boolean esDestacado() {
        return cursoDados > 3;
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMurallas(2);
    }
}
