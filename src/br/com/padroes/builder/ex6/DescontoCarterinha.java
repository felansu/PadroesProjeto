package br.com.padroes.builder.ex6;

/**
 * Created by felansu on 05/04/2015.
 */
public class DescontoCarterinha implements Desconto {

    String aluno;
    String faculdade;
    String periodo;

    @Override
    public String getAluno() {
        return this.aluno;
    }

    @Override
    public String getFaculdade() {
        return this.faculdade;
    }

    @Override
    public String getPeriodo() {
        return this.periodo;
    }

    @Override
    public String toString() {
        return "DescontoCarterinha{" +
                "aluno='" + aluno + '\'' +
                ", faculdade='" + faculdade + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}