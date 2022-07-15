package facci.rogercruz.practica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;


public class main extends Fragment {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
    }
//no se debe agregar la parte de abajo
    private void setContentView(int activity_main) {
    }

}