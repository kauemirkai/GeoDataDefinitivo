package br.usjt.deswebmob.paises.model.dao;

import java.io.IOException;

import br.usjt.deswebmob.paises.model.entity.Pais;
import br.usjt.deswebmob.paises.model.entity.Regiao;

/**
 * @Author Kaue Mirkai
 * Ra:81613004
 */


public interface PaisDAO {
    Pais[] buscarPaises(Regiao regiao) throws IOException;
}
