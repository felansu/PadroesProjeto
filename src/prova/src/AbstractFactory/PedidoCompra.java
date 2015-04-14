package AbstractFactory;

/**
 * Created by felansu on 08/04/2015.
 */
public class PedidoCompra implements Pedido{
    @Override
    public NF gerarNF() {
        return new NFEntrada();
    }

    @Override
    public Estoque gerarEST() {
        return new EstoqueSaida();
    }
}
