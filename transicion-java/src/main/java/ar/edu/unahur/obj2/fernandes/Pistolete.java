package ar.edu.unahur.obj2.fernandes;

public class Pistolete implements Arma {
    
    private Integer largo;

    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() > 30 ? 3 * largo : 2 * largo;
    }
}
