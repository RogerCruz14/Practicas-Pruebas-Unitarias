package facci.rogercruz.practica;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ValidarTest {

    @Test
    public void validarCampo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarCampo("Roger"));
    }
    @Test
    public void validarLargo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarLargo("CruzRoger"));
    }
    @Test
    public void validarlargo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarlargo("Roger Cruz"));
    }

    @Test
    public void validarCampo_False() {
        Validar validar = new Validar();
        assertTrue(validar.validarCampo("Walter"));
    }
    @Test
    public void validarLargo_False() {
        Validar validar = new Validar();
        assertTrue(validar.validarLargo("UlfredoCruz"));
    }
    @Test
    public void validarlargo_False() {
        Validar validar = new Validar();
        assertTrue(validar.validarlargo("Walter Ulfredo"));
    }

}
