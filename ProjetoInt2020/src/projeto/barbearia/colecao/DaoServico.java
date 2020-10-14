package projeto.barbearia.colecao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.modelo.Profissional;
import projeto.barbearia.modelo.Servico;

public class DaoServico {

	public void inserirServico(Servico serv) {
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

}
