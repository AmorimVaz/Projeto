package projeto.barbearia.colecao;

import java.util.List;

import org.hibernate.Session;

import projeto.barbearia.modelo.Servico;

public class DaoServico {
	
	public static void inserirServico(Servico serv) { // INSERT
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.save( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void removerServico(Servico serv) { // DELETE
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}

	public static void editarServico(Servico serv) { // UPDATE
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}

	public static Servico localizarServicoPorCodigo(int cod){
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Servico WHERE id == 1
		Servico obj = (Servico) sessao.createQuery("FROM Servico WHERE id = " + cod).uniqueResult();
		//Servico obj2 = (Servico) sessao.load(Servico.class, cod);
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static List<Servico> filtrarServicoPorValor(double v){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Servico WHERE valor >= 10
		List<Servico> lista = sessao.createQuery("FROM Servico WHERE valor >= " + v).list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	public static List<Servico> filtrarServicoPorNome(String str){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Servico WHERE nome like '%%'
		List<Servico> lista = sessao.createQuery("FROM Servico WHERE nome like '%"+str+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	
	public static List<Servico> listarServico() {	// SELECT
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Servico
		List<Servico> lista = sessao.createQuery("FROM Servico").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
}
