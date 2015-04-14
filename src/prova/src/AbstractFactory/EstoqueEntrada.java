package AbstractFactory;

/**
 * Created by felansu on 08/04/2015.
 */
public class EstoqueEntrada implements Estoque {
    @Override
    public void gerarEstoque() {
        System.out.println("Gerando ESTOQUE de compra/ENTRADA...");
    }
}
