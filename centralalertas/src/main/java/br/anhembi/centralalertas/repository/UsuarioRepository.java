package br.anhembi.centralalertas.repository;

import br.anhembi.centralalertas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findByUsernameAndSenha(String username, String senha);
}