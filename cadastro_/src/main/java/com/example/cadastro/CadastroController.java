package com.example.cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CadastroController {
    @GetMapping("/")
    public String cadastro(
     @RequestParam String name,
     @RequestParam String curso   
     ) {
        return ""
        + "<h1>Cadastro Realizado!</h1>"
        + "<p>Nome: " + name + "</p>"
        + "<p>Curso: " + curso + "</p>";
    }
}
