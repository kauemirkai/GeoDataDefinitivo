package br.usjt.deswebmob.paises.view;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.usjt.deswebmob.paises.R;



/**
 * @Author Kaue Mirkai
 * Ra:81613004
 */

public class DetalhePaisFragment extends Fragment {


    public DetalhePaisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhe_pais, container, false);
    }

}
