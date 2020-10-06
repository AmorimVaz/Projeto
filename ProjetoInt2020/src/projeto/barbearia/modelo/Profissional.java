package projeto.barbearia.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity								// Create Table Profissional
public class Profissional{

	@Id								// codigo será uma chave da entidade
	@GeneratedValue					// a chave (codigo) será gerada automaticamente
	private int codigo;
	
	private String nome;
	private double nota; 
	
	
	public Profissional() {}
	
	public Profissional(String nome) {
		this.nome = nome;
		nota = -1;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return codigo + " - " + nome;
	}
	
}
