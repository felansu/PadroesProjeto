package recordatorio.exercicios.revisao1.Ex3;

public class Triangulo {
	private int lado1 = 5;
	private int lado2 = 3;
	private int lado3 = 2;

	public void imprimir() {
		System.out.println(lado1 == lado2 && lado2 ==lado3 ? "Equilátero":lado1 == lado2 || lado2 == lado3 || lado3==lado1 ? "Isosceles" : "Escaleno");
	}

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.imprimir();
	}
}
