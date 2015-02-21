package padroes.builder.ex2;

import java.util.Calendar;

public class ItauBoleto implements Boleto{
	
	private String sacado;
    private int nossoNro;
    private Calendar vencimento;
    private double valor;
    private String cedente;
    
	public ItauBoleto(String sacado, int nossoNro, Calendar vencimento,
			double valor, String cedente) {
		super();
		this.sacado = sacado;
		this.nossoNro = nossoNro;
		this.vencimento = vencimento;
		this.valor = valor;
		this.cedente = cedente;
	}

	@Override
	public String getSacado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCedente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calendar getVencimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "ItauBoleto [sacado=" + sacado + ", nossoNro=" + nossoNro
				+ ", vencimento=" + vencimento + ", valor=" + valor
				+ ", cedente=" + cedente + "]";
	}
	
}
