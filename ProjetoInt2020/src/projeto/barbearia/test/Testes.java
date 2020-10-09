package projeto.barbearia.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.colecao.Database;
import projeto.barbearia.modelo.Profissional;

public class Testes {

	public static void main(String[] args) {
		
		// GUI - Form
		String nome = "João";
		
		Profissional prof = new Profissional(nome);
				
		Database.inserirProfssional( prof );
	}
}
