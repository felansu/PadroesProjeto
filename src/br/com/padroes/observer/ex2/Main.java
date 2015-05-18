package br.com.padroes.observer.ex2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Acao usuarioObserver = new Acao("Devolução de livro", null, new ArrayList());
		Usuario ferran = new Usuario("ferran");
		Usuario aparecida = new Usuario("aparecida");
		
		usuarioObserver.adicionarObservador(ferran);
		usuarioObserver.adicionarObservador(aparecida);
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 2);
		SimpleDateFormat sdp = new SimpleDateFormat("dd 'de' MMMM, yyyy");
		usuarioObserver.setInformacao(sdp.format(c.getTime()));
		
	}
}
