package br.usjt.deswebmob.paises;

import android.content.Context;


/**
 * @Author Kaue Mirkai
 * Ra:81613004
 */


public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
