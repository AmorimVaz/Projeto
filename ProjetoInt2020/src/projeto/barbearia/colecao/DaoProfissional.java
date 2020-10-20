package projeto.barbearia.colecao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class DaoProfissional {

	public void salvarProfissional(Profissional prof) {
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
	
	private void inserirProfssional(Profissional prof) {
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
	
	public void excluirProfssional(Profissional prof) {
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
	
	public void editarProfssional(Profissional prof) {
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

	public List<Profissional> listarProfissional(){
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
}
