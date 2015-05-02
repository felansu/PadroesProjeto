package provaN1.abstractfactory;

/**
 * Created by felansu on 08/04/2015.
 */
public class PedidoVenda implements Pedido{
    @Override
    public NF gerarNF() {
        return new NFSaida();
    }

    @Override
    public Estoque gerarEST() {
        return new EstoqueSaida();
    }
}