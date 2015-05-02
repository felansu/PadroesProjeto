package provaN1.builder;

public class SpedContabil implements Sped {

    @Override
    public void gerarArquivo(String texto) {
        System.out.println("SpedContabil: Gerando arquivo... "+texto);
    }

}
