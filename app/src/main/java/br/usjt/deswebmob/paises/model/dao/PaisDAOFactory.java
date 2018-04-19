package br.usjt.deswebmob.paises.model.dao;

import br.usjt.deswebmob.paises.Contexto;


/**
 * @Author Kaue Mirkai
 * Ra:81613004
 */

public class PaisDAOFactory {

    public static PaisDAO getPaisDAO(boolean onLine){
        if (onLine) {
            return new PaisDAORest();
        } else {
            return new PaisDAODb(Contexto.getValue());
        }
    }
}
