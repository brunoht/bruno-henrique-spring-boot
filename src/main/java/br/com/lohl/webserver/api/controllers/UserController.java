package br.com.lohl.webserver.api.controllers;

import br.com.lohl.webserver.api.models.User;
import br.com.lohl.webserver.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements CRUDController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.list());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> get() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> update() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
