package me.wallacedev.yokailist.repository;
/**
 * A classe Repository é uma interface usada para manipular operações CRUD (Create, Read, Update, Delete).
 * Ela nos permite criar dados (Create), ler dados (Read) do banco de dados, atualizar dados (Update) e deletar dados (Delete).
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.wallacedev.yokailist.models.User;

@Repository
//aqui abaixo preciso fazer uma heranca para poder fazer as operacoes crud e preciso passar minha entidade e o tipo do seu identificador
public interface UserRepository extends JpaRepository<User,Long>{ 


}
