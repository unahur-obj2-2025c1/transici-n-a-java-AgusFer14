package ar.edu.unahur.obj2.fernandes;

public class Atleta extends Persona {
    
    private Integer masaMuscular = 4;
    private Integer cantTecnicas = 2;

    public Atleta(Integer edad) {
        super(edad);
    }

    @Override
    public Integer potencia() {
        return super.potencia() + (masaMuscular * cantTecnicas);
    }

    @Override
    public Boolean esDestacado() {
        return super.esDestacado() || cantTecnicas > 5;
    }

    public void entrenar(Integer cantDias) {
        masaMuscular += cantDias / 5;
    }

    public void aprenderTecnica() {
        cantTecnicas += 1;
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMuseo();
    }
}
