package br.com.padroes.builder.ex6;

/**
 * Created by felansu on 05/04/2015.
 */
public class BuilderDescontoDocumento implements BuilderDesconto {

    private String aluno;
    private String faculdade;
    private String periodo;

    @Override
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    @Override
    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    @Override
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public Desconto getDesconto() {
        return new DescontoDocumento();
    }
}