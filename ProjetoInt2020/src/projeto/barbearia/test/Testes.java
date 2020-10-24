package projeto.barbearia.test;

import projeto.barbearia.colecao.DaoProfissional;
import projeto.barbearia.colecao.DaoServico;
import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class Testes {

	public static void main(String[] args) {
		System.out.println("== Listar ==================");
		for(Servico s: DaoServico.listarServico()) {
			System.out.println( "ID:" + s.getId() +  "\t Valor:" +s.getValor()+  "\t Nome: " + s.getNome() );
		}
		
		System.out.println("== Filtrar ==================");
		for(Servico s: DaoServico.filtrarServicoPorValor( 16 )) {
			System.out.println( "Valor:" +s.getValor()+  "\t Nome: " + s.getNome() );
		}
		
		System.out.println("== Filtrar ==================");
		for(Servico s: DaoServico.filtrarServicoPorNome( "Lu" )) {
			System.out.println( "Valor:" +s.getValor()+  "\t Nome: " + s.getNome() );
		}
		
		System.out.println("== Localizar ==================");
		Servico localizado = DaoServico.localizarServicoPorCodigo(2);
		System.out.println( "Valor:" +localizado.getValor()+  "\t Nome: " + localizado.getNome() );
		
		//DaoServico.removerServico(localizado);
		
//		Profissional p1 = new Profissional("João");
//		System.out.println( p1 );
//		
//		p1.setNota( 4 );
//		System.out.println( p1 );
//		
//		p1.setNota( 5 );
//		System.out.println( p1 );
//		
//		p1.setNota( 4.5 );
//		System.out.println( p1 );

//		// Input
		String nome = "João2";
		double n1 = 3;
		
		Servico serv = new Servico("corte2", 29.99);
//		db.inserirServico( serv );
		
		Profissional prof = new Profissional(nome, n1, serv);
		DaoProfissional.salvarProfissional( prof );
		
//		for(Profissional p : DaoProfissional.listarProfissional()) {
//			System.out.println(p);
//		}
//		
//		//System.out.println( prof.getServico().getNome() );
	}
}
