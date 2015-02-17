package recordatorio.exercicios.revisao1.Ex5;

public class Retangulo implements ObjetoGeometrico{

	@Override
	public Double calcularArea() {
		return altura() * base();
	}
	
	Double altura(){
		return 6.8;
	}
	
	Double base(){
		return 4.0;
	}
}
