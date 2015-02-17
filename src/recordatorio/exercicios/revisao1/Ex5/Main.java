package recordatorio.exercicios.revisao1.Ex5;

public class Main {
	public static void main(String[] args) {
		ObjetoGeometrico  objetoG = new Circulo();
		System.out.println("Área do circulo: " +objetoG.calcularArea());
		
		objetoG = new Retangulo();
		System.out.println("Área do rectangulo: " +objetoG.calcularArea());
		
		objetoG = new Quadrado();
		System.out.println("Área do quadrado: " +objetoG.calcularArea());
		
	}
}
