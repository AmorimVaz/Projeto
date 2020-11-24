package projeto.barbearia.colecao;

import java.util.List;

import org.hibernate.Session;

import projeto.barbearia.modelo.Perfil;

public class DaoPerfil {
	
	public static void inserirPerfil(Perfil serv) { // INSERT
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.save( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void removerPerfil(Perfil serv) { // DELETE
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}

	public static void editarPerfil(Perfil serv) { // UPDATE
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update( serv );
		
		sessao.getTransaction().commit();
		sessao.close();
	}

	public static Perfil localizarPerfilPorCodigo(int cod){
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Perfil WHERE id == 1
		Perfil obj = (Perfil) sessao.createQuery("FROM Perfil WHERE id = " + cod).uniqueResult();
		//Perfil obj2 = (Perfil) sessao.load(Perfil.class, cod);
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static Perfil localizarPerfilPorUsuario(String username){
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Perfil WHERE id == 1
		Perfil obj = (Perfil) sessao.createQuery("FROM Perfil WHERE usuario = '" + username +"'").uniqueResult();
		//Perfil obj2 = (Perfil) sessao.load(Perfil.class, cod);
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static List<Perfil> filtrarPerfilPorNome(String str){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Perfil WHERE nome like '%%'
		List<Perfil> lista = sessao.createQuery("FROM Perfil WHERE usuario like '%"+str+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	
	public static List<Perfil> listarPerfil() {	// SELECT
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		// SELECT * FROM Perfil
		List<Perfil> lista = sessao.createQuery("FROM Perfil").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
}
