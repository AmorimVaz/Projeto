package projeto.barbearia.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.colecao.Database;
import projeto.barbearia.modelo.Profissional;

public class Testes {

	public static void main(String[] args) {
		
		// GUI - Form
		int cod = 1;
		String nome = "João";
		double n1 = 3;
		
		//Profissional prof = new Profissional(nome);
		Profissional prof = new Profissional(cod, nome, n1);
				
		Database.inserirProfssional( prof );
	}
}
