package br.com.lohl.webserver.api.controllers;

import br.com.lohl.webserver.api.models.MouseWheel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/mouse-wheel")
public class MouseWheelController {

    @RequestMapping(method = RequestMethod.GET, value = "/up")
    public ResponseEntity<?> up() {
        try {
            System.setProperty("java.awt.headless", "false");
            MouseWheel mouseWheel = new MouseWheel();
            mouseWheel.up();
        } catch (AWTException e) {
//            return "fail: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail: " + e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/down")
    public ResponseEntity<?> down() {
        try {
            System.setProperty("java.awt.headless", "false");
            MouseWheel mouseWheel = new MouseWheel();
            mouseWheel.down();
        } catch (AWTException e) {

            String message = e.getMessage();

            for (StackTraceElement element : e.getStackTrace()) {
                message += element.getClassName() + " | ";
                message += element.getMethodName() + " | ";
                message += element.getFileName() + " | ";
                message += element.getLineNumber() + "\n";
            }
//            return message;
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
