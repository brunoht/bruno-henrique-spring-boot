package br.com.lohl.webserver.api.repositories;

import br.com.lohl.webserver.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
