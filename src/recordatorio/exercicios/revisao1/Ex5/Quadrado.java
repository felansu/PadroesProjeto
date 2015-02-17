package recordatorio.exercicios.revisao1.Ex5;

public class Quadrado implements ObjetoGeometrico{

	@Override
	public Double calcularArea() {
		return area() * area();
	}

	Double area() {
		return 6.4;
	}
	
	

}
