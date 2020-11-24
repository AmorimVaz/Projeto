package projeto.barbearia.colecao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Profissional;

public class DaoProfissional {

	public static void salvarProfissional(Profissional prof) {
		// Se o nome do profissional já esteja cadastrado, informar erro
				
		// 1. consulta no nome no BD
		for(Profissional p : listarProfissional()) {
			if( prof.getNome().equals( p.getNome() ) ) {
				// 2. se existir, informar erro
				System.err.println("Profissional já cadastrado");
				return;
			}
		}
		// 3. senão, inserir no BD
		inserirProfssional( prof );	
	}
	
	private static void inserirProfssional(Profissional prof) {
		// 1. Abrir conexão
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		sessao.save( prof );
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
	}
	
	public static void excluirProfssional(Profissional prof) {
		// 1. Abrir conexão
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		sessao.delete( prof );
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
	}
	
	public static void editarProfssional(Profissional prof) {
		// 1. Abrir conexão
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		sessao.update( prof );
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
	}

	public static List<Profissional> listarProfissional(){
		// 1. Abrir conexão
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		List<Profissional> lista = sessao.createQuery("FROM Profissional").list();
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
		
		return lista;
	}
	
	public static Profissional localizarProfissionalPorCodigo(int cod){
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Profissional WHERE id == 1
		Profissional obj = (Profissional) sessao.createQuery("FROM Profissional WHERE codigo = " + cod).uniqueResult();
		//Profissional obj2 = (Profissional) sessao.load(Profissional.class, cod);
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
}
