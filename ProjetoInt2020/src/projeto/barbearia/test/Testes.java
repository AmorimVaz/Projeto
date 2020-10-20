package projeto.barbearia.test;

import projeto.barbearia.colecao.DaoProfissional;
import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class Testes {

	public static void main(String[] args) {
		Profissional p1 = new Profissional("José");
		System.out.println( p1 );
		
		p1.setNota( 4 );
		System.out.println( p1 );
		
		p1.setNota( 5 );
		System.out.println( p1 );
		
		p1.setNota( 4.5 );
		System.out.println( p1 );
		
		p1.setNota( 1 );
		System.out.println( p1 ); 
		
		
		DaoProfissional db = new DaoProfissional();
//		
//		// Input
//		String nome = "João2";
//		double n1 = 3;
//		
//		Servico serv = new Servico("corte2", 29.99);
//		//db.inserirServico( serv );
//		
//		Profissional prof = new Profissional(nome, n1, serv);
		db.salvarProfissional( p1 );
//		
//		//System.out.println( prof.getServico().getNome() );
	}
}
