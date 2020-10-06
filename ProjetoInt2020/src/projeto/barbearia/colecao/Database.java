package projeto.barbearia.colecao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.barbearia.modelo.Profissional;

public class Database {

	public static void inserirProfssional(Profissional prof) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		// 1. Abrir conexão
		Session sessao = sf.openSession();
		
		// 2. Iniciar uma transação
		sessao.beginTransaction();

		// 3. Executar a transação
		sessao.save( prof );
		
		// 4. Fechar a transação
		sessao.getTransaction().commit();
		
		// 5. Fechar a conexão
		sessao.close();
	}

}
