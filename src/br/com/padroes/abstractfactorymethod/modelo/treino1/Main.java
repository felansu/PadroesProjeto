package br.com.padroes.abstractfactorymethod.modelo.treino1;

/**
 * Created by felansu on 06/04/2015.
 */
public class Main {
    public static void main(String[] args) {
        FabricaCriador c = new FabricaCriador();
        c.criar(c.CADEIRA_BASICA).montarCadeira();

    }
}
