package br.com.padroes.Singleton.ex1;

import java.util.HashMap;

public class Configuracao {
	private HashMap<String, String> propiedades;
	private static Configuracao instance;
	
	public Configuracao() {
		this.propiedades = new HashMap<String, String>();
		this.propiedades.put("nome", "Ferran Gonzalez Alonso");
		this.propiedades.put("idade", "25");
		this.propiedades.put("idioma", "Java");
	}

	public static Configuracao getInstance() {
		if (Configuracao.instance == null) {
			Configuracao.instance = new Configuracao();
		}
		return instance;
	}

	public String getPropiedade(String key){
		return propiedades.get(key);
	}
}
