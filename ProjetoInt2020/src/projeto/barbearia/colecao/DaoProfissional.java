package projeto.barbearia.colecao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class DaoProfissional {

	public void inserirProfssional(Profissional prof) {
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

}
