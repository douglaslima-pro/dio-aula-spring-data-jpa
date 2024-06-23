package edu.douglaslima.spring.springbootJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import edu.douglaslima.spring.springbootJPA.model.Usuario;
import edu.douglaslima.spring.springbootJPA.repository.UsuarioRepository;

import java.util.Optional;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	UsuarioRepository repository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Todos os usuários do sistema:");
		this.repository.findAll().forEach(System.out::println);
		System.out.println("Usuário com ID igual a 3:");
		Optional<Usuario> usuarioEncontrado = this.repository.findById(3);
		if (usuarioEncontrado.isPresent()) {
			System.out.println(usuarioEncontrado.get());
		} else {
			System.out.println("Nenhum usuário encontrado com esse ID!");
		}
		System.out.println("Todos os usuários que o nome contém \"Maria\":");
		this.repository.findByNomeContaining("Maria").forEach(System.out::println);
		System.out.println("Todos os usuários que o nome de usuário termina com 'a':");
		this.repository.findByNomeUsuarioEndingWith('a').forEach(System.out::println);
	}

}
