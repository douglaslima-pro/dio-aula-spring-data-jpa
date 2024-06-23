package edu.douglaslima.spring.springbootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import edu.douglaslima.spring.springbootJPA.model.Usuario;
import java.util.List;

@Component
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	// retorna todos os usuários se o nome conter o argumento String
	List<Usuario> findByNomeContaining(String nome);
	
	// retorna todos os usuários que o nome de usuário termina a letra do argumento
	List<Usuario> findByNomeUsuarioEndingWith(char ultimaLetra);
	
}
