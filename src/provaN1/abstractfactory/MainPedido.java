package provaN1.abstractfactory;

/**
 * Created by felansu on 08/04/2015.
 */
public class MainPedido {
    public static void main(String[] args) {
        CriadorDoPedido cdp = new CriadorDoPedido();
        cdp.getGerarPedido(1);
        cdp.getGerarPedido(2);
    }
}
