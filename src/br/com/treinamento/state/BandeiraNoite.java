package br.com.treinamento.state;

/**
 * Created by felansu on 12/05/2015.
 */
public class BandeiraNoite implements Bandeira {
    @Override
    public double calcularBandeira(double tempo, double distancia) {
        return (tempo * distancia) * 2;
    }
}
