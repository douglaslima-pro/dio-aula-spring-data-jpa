package edu.douglaslima.spring.springbootJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario", schema = "sistemalogin")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Integer id;
	@Column(length = 150,
			nullable = false)
	private String nome;
	@Column(name = "usuario",
			length = 30,
			nullable = false,
			unique = true)
	private String nomeUsuario;
	@Column(length = 30,
			nullable = false)
	private String senha;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome='" + nome + "', usuario='" + nomeUsuario + "', senha='" + senha + "']";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
