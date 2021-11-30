package br.edu.unidep.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.unidep.unumeracao.Status;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlivro ;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name= "autor", nullable = false)
	private String autor;
	
	@Column(name = "editora", nullable = false)
	private String editora;
	
	@Temporal(TemporalType.DATE)
	private Date dataedicao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status status;
	
	public Livro(String nome, String autor, String editora, Date dataedicao, Status status) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.dataedicao = dataedicao;
		this.status = status;
	}
	
	
	
	public int getIdlivro() {
		return idlivro;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getEditora() {
		return editora;
	}



	public void setEditora(String editora) {
		this.editora = editora;
	}



	public Date getDataedicao() {
		return dataedicao;
	}



	public void setDataedicao(Date dataedicao) {
		this.dataedicao = dataedicao;
	}



	public Livro(){
		
	}



	@Override
	public String toString() {
		return "Livro [idlivro=" + idlivro + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora
				+ ", dataedicao=" + dataedicao + ", status=" + status + "]";
	}
	
	
}
