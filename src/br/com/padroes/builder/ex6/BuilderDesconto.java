package br.com.padroes.builder.ex6;

/**
 * Created by felansu on 05/04/2015.
 */
public interface BuilderDesconto {

    void setAluno(String aluno);
    void setFaculdade(String faculdade);
    void setPeriodo(String periodo);

    Desconto getDesconto();
}