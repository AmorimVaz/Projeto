package projeto.barbearia.colecao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import projeto.barbearia.modelo.Servico;

public class DaoServico {

	public void inserirServico(Servico serv) { // INSERT
		// 1. Abrir conexão
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		sessao.save( serv );
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
		
	}

	public List<Servico> listarServico() {
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		List<Servico> lista = sessao.createQuery("FROM Servico").list();
		
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
}
