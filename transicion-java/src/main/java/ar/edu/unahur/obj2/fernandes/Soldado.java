package ar.edu.unahur.obj2.fernandes;

import java.util.List;

public class Soldado extends Persona {
    
    private List<Arma> armas;

    public Soldado(Integer edad) {
        super(edad);
    }

    @Override
    public Integer potencia() {
        return super.potencia() + armas.stream().mapToInt(arma -> arma.potencia()).sum();
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMurallas(5);
    }
}
