package ar.edu.unahur.obj2.fernandes;

public class Espadon implements Arma {
    
    private Integer peso;

    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() < 40 ? peso / 2 : 6; 
    }
}
