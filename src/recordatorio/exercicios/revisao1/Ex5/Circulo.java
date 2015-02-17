package recordatorio.exercicios.revisao1.Ex5;

public class Circulo implements ObjetoGeometrico{

	@Override
	public Double calcularArea() {
		return Math.PI * (raio() * raio());
	}
	
	Double raio(){
		return 6.0;
	}

}
