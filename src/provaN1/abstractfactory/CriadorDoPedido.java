package provaN1.abstractfactory;


/**
 * Created by felansu on 08/04/2015.
 */
public class CriadorDoPedido {

    void getGerarPedido(Integer tipo){
        if (tipo.equals(1)){
            new PedidoCompra().gerarNF().gerarNF();
            new PedidoCompra().gerarEST().gerarEstoque();
        }else if(tipo.equals(2)){
            new PedidoVenda().gerarNF().gerarNF();
            new PedidoVenda().gerarEST().gerarEstoque();

        }
    }
}
