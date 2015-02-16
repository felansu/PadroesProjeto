package recordatorio.interfaces.exemplo;

public class Principal {
	
	public static void main(String[] args) {
//		ImpressoraJT jt = new ImpressoraJT();
//		ImpressoraMatricial im = new ImpressoraMatricial();
//		
//		jt.imprimir("Opa");
//		im.imprimir("Opa");
		
		imprimir(new ImpressoraJT(), "Opa");
		imprimir(new ImpressoraMatricial(), "Opa");
		
	}
	
	public static void imprimir(Impressora impressora, String texto){
		impressora.imprimir(texto);
	}
	
}
