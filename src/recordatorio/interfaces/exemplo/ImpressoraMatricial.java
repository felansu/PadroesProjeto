package recordatorio.interfaces.exemplo;

public class ImpressoraMatricial implements Impressora {

	@Override
	public void imprimir(String texto) {
		System.out.println("Imprimindo na Matricial: "+texto);
	}

}
