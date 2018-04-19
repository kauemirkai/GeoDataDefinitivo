package br.usjt.deswebmob.paises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @Author: Kaue mirkai
 * RA:81613004
 *
 */
public class ListaPaisesActivity extends Activity {
    public static final String PAIS = "br.usjt.deswebmob.paises.pais";
    Activity atividade;
    ArrayList<Pais> paises;
    ArrayList<String> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
        atividade = this;
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        paises = Data.listarPaises(continente);
        nomes = Data.listarNomes(paises);

        ListView listView = findViewById(R.id.lista_paises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nomes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(atividade, DetalhePaisActivity.class);
                intent.putExtra(PAIS, paises.get(position));
                startActivity(intent);
            }
        });

    }


}
