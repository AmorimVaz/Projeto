package projeto.barbearia.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity								// Create Table Profissional
public class Profissional{

	@Id								// codigo será uma chave da entidade
	@GeneratedValue					// a chave (codigo) será gerada automaticamente
	private int codigo;
	
	private String nome;
	private double nota;			// média de todas as notas 
	
	@ManyToOne //(cascade = CascadeType.ALL )
	private Servico servico;		// Associação


	public Profissional() {}
	
	public Profissional(String nome, double nota, Servico servico) {
		this.nome = nome;
		this.nota = nota;
		this.servico = servico;
	}
	
	public Profissional(String nome) {
		this.nome = nome;
		nota = -1;
	}
	
	
	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
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

	public void setNota(double novaNota) {
		// Se for a 1º nota.... apenas atribuir
		// Senão... calcular média
		
		if(nota == -1)
			nota = novaNota;
		else
			nota = (nota + novaNota) / 2;
		
		//nota = nota == -1 ? novaNota : (nota + novaNota) / 2;
	}
	
	@Override
	public String toString() {
		return codigo + " - " + nome + " | " + nota;
	}
	
}
