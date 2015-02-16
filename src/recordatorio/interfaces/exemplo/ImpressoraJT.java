package recordatorio.interfaces.exemplo;

public class ImpressoraJT implements Impressora{

	@Override
	public void imprimir(String texto) {
		System.out.println("Imprimindo na jato de tinta: "+texto);
	}


}
