package br.com.lohl.webserver.api.services;

import br.com.lohl.webserver.api.models.User;
import br.com.lohl.webserver.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list(){
        return userRepository.findAll();
    }
}
