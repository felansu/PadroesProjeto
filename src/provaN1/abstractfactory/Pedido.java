package provaN1.abstractfactory;

/**
 * Created by felansu on 08/04/2015.
 */
public interface Pedido {
    NF gerarNF();
    Estoque gerarEST();
}
