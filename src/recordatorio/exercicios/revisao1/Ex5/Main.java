package recordatorio.exercicios.revisao1.Ex5;

public class Main {
	public static void main(String[] args) {
		ObjetoGeometrico  objetoG = new Circulo();
		System.out.println("�rea do circulo: " +objetoG.calcularArea());
		
		objetoG = new Retangulo();
		System.out.println("�rea do rectangulo: " +objetoG.calcularArea());
		
		objetoG = new Quadrado();
		System.out.println("�rea do quadrado: " +objetoG.calcularArea());
		
	}
}
