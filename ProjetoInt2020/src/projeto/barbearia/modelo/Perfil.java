package projeto.barbearia.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Perfil {

	@Id
	@GeneratedValue
	private int id;
	
	private String usuario;
	private String senha;
	
	@ManyToOne
	private Profissional profissional;

	// Construtor
	public Perfil(String usuario, String senha, Profissional profissional) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.profissional = profissional;
	}
	
	public Perfil() {
		super();
	}
	
	// Métodos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	
	
	
	
}
