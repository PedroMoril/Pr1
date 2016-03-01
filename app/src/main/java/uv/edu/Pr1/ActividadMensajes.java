package uv.edu.Pr1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import java.io.File;
import java.util.ArrayList;

import uv.edu.tarea3.R;
//import uv.edu.Pr1.R;  //¿??¿



public class ActividadMensajes extends AppCompatActivity {
    //private Button boton;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajes_activity);

        //leer preferencias, si no hay nada (null), lanzar la actividad que recoje y escribe en preferencias PreferencesActivity
        sharedPref = getPreferences(MODE_PRIVATE);
        String usuario = String.valueOf( sharedPref.getString("usuario", "") );

        if(usuario.equals("")){
            Intent evento = new Intent(getApplicationContext(), ActividadUsuario.class);
            startActivity(evento);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        //HACER cambiar icono
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


        //HACER comprobar preferences, si null

        // Crear un intent explícito para lanzar la actividad PreferencesActivity

        // Lanzar la actividad usando el Intent creado

        //else nada


    }


    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);

    }
    */

}
