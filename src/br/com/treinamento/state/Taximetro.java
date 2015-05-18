package br.com.treinamento.state;

/**
 * Created by felansu on 12/05/2015.
 */
public class Taximetro {

    static Bandeira b1 = new BandeiraDia();
    static Bandeira b2 = new BandeiraNoite();

    public static void main(String[] args) {
        System.out.println(b1.calcularBandeira(10, 10));
        System.out.println(b2.calcularBandeira(10,10));
    }

}