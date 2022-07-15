package facci.rogercruz.practica;

import android.os.Bundle;
import android.widget.EditText;

public class Validar {

    public boolean validarCampo(String nombre) {
        if (nombre.length() == 0){
            return false;
        }
        return true;
    }

    public boolean validarLargo(String cadena) {
        if (cadena.length() >= 8){
            return true;
        }
        return false;
    }

    public boolean validarlargo(String apellido) {
        if (apellido.length() >= 8){
            return true;
        }
        return false;
    }

}
