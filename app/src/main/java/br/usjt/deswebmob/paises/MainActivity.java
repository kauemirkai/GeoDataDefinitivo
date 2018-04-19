package br.usjt.deswebmob.paises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * @Author: Kaue mirkai
 * RA:81613004
 *
 */
public class MainActivity extends Activity {
    Spinner spinnerContinente;
    public static final String CHAVE = "br.usjt.deswebmob.paises.txtContinente";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerContinente = findViewById(R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());
    }

    public void listarPaises(View view) {
        Intent intent = new Intent(this, ListaPaisesActivity.class);
        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
         @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
             continente = (String) parent.getItemAtPosition(position);
         }

         @Override
        public void onNothingSelected(AdapterView<?> parent){

         }
    }
}
