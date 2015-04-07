package br.com.padroes.builder.ex6;

/**
 * Created by felansu on 05/04/2015.
 */
public class GeradorDesconto {
    BuilderDesconto builder;

    public GeradorDesconto(BuilderDesconto builder) {
        this.builder = builder;
    }

    public String gerarDesconto(){
        return this.builder.getDesconto().toString();
    }
}
