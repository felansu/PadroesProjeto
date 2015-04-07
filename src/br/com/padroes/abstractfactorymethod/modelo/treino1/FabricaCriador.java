package br.com.padroes.abstractfactorymethod.modelo.treino1;

/**
 * Created by felansu on 06/04/2015.
 */
public class FabricaCriador {
    public static final int CADEIRA_BASICA = 1;
    public static final int CADEIRA_PROFISSIONAL = 2;

    public FabricaCadeiras criar(Integer tipo) {
        if (tipo.equals(CADEIRA_BASICA)) {
            return new CadeiraBasica();
        } else {
            return new CadeiraProfissional();
        }
    }
}