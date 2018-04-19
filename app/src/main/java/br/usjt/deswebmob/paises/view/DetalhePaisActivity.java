package br.usjt.deswebmob.paises.view;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.usjt.deswebmob.paises.model.entity.Pais;
import br.usjt.deswebmob.paises.R;



/**
 * @Author Kaue Mirkai
 * Ra:81613004
 */

public class DetalhePaisActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaisesActivity.PAIS);

        ImageView bandeira = (ImageView)findViewById(R.id.img_bandeira_pais);
        bandeira.setImageDrawable(br.usjt.deswebmob.paises.view.Util.getDrawable(this, pais.getCodigo3().toLowerCase()));

        TextView nome = (TextView)findViewById(R.id.txt_nome_pais);
        nome.setText(pais.getNome());

        TextView capital = (TextView)findViewById(R.id.txt_capital);
        capital.setText(pais.getCapital());

        TextView regiao = (TextView)findViewById(R.id.txt_regiao);
        regiao.setText(pais.getRegiao());

        TextView subregiao = (TextView)findViewById(R.id.txt_subregiao);
        subregiao.setText(pais.getSubRegiao());

        TextView demonimo = (TextView)findViewById(R.id.txt_demonimo);
        demonimo.setText(pais.getDemonimo());

        TextView area = (TextView)findViewById(R.id.txt_area);
        area.setText(String.format("%1$,d km\u00B2", pais.getArea()));

        TextView populacao = (TextView)findViewById(R.id.txt_populacao);
        populacao.setText(String.format("%1$,d", pais.getPopulacao()));

        TextView gini = (TextView)findViewById(R.id.txt_gini);
        gini.setText(String.format("%.2f", pais.getGini()));

        TextView latitude = (TextView)findViewById(R.id.txt_latitude);
        latitude.setText(String.format("%.2f", pais.getLatitude()));

        TextView longitude = (TextView)findViewById(R.id.txt_longitude);
        longitude.setText(String.format("%.2f", pais.getLongitude()));
    }
}
