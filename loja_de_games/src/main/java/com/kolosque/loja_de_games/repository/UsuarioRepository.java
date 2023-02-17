package com.kolosque.loja_de_games.repository;

import com.kolosque.loja_de_games.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {

    public Optional<Usuarios> findByUsuarios(String usuario);


}
