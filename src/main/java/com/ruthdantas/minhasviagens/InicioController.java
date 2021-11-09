package com.ruthdantas.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/inicio")
    public String exibirTelaInicial() {
        return "Olá mundo no Spring!";
    }

    @GetMapping("/") //a anotação get mapping vai em cima do método, ele vai informar que aquele método vai responder as
    // requisições http com o metodo/verbo GET
    public String exibirTelaRaiz() {
        return "Olá mundo no Spring na rota raiz!";
    }
}
