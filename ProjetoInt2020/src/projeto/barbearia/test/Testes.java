package projeto.barbearia.test;

import projeto.barbearia.colecao.DaoProfissional;
import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class Testes {

	public static void main(String[] args) {
		
		DaoProfissional db = new DaoProfissional();
		
		// Input
		String nome = "João2";
		double n1 = 3;
		
		Servico serv = new Servico("corte2", 29.99);
		//db.inserirServico( serv );
		
		Profissional prof = new Profissional(nome, n1, serv);
		db.inserirProfssional( prof );
		
		//System.out.println( prof.getServico().getNome() );
	}
}
