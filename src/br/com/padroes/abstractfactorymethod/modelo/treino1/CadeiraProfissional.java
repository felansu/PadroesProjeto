package br.com.padroes.abstractfactorymethod.modelo.treino1;

/**
 * Created by felansu on 06/04/2015.
 */
public class CadeiraProfissional implements FabricaCadeiras{

    @Override
    public void montarCadeira() {
        System.out.println("CadeiraProfissional.montarCadeira");
    }
}
