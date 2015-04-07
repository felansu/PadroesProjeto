package br.com.padroes.builder.ex6;

import java.util.logging.Logger;

/**
 * Created by felansu on 05/04/2015.
 */
public class Main {
    public static void main(String[] args) {
        GeradorDesconto gerador = new GeradorDesconto(new BuilderDescontoCarterinha());
        System.out.print(gerador.gerarDesconto());
    }
}
