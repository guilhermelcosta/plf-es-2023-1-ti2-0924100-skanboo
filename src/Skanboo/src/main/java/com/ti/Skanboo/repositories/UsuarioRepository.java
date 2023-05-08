package com.ti.Skanboo.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ti.Skanboo.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> /* <Entidade, tipo da variavel Id> */ {

    @Transactional(readOnly = true)
    Usuario findByEmail(String email);

}
