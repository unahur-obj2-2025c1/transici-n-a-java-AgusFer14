package ar.edu.unahur.obj2.fernandes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    
    private Persona julieta = new Persona(42);

    @Test
    public void creacionPersonaGenerica() {
        
        assertEquals(Persona.class, julieta.getClass());
    }

    @Test
    public void creacionPersonaGenericaDe42Anios() {
        
        assertEquals(42, julieta.getEdad());
    }

    @Test
    public void potenciaDeJulieta() {
        
        assertEquals(20, julieta.potencia());
    }

    
}
