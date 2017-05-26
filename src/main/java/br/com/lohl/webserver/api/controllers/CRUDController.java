package br.com.lohl.webserver.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public interface CRUDController {

    // @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> list();

    // @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save();

    // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> get();

    // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete();

    // @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> update();
}
