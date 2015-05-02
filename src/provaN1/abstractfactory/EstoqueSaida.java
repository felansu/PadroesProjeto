package provaN1.abstractfactory;

/**
 * Created by felansu on 08/04/2015.
 */
public class EstoqueSaida implements Estoque {
    @Override
    public void gerarEstoque() {
        System.out.println("Gerando ESTOQUE de venda/SAIDA...");
    }
}
