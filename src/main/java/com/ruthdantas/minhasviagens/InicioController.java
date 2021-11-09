package com.ruthdantas.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InicioController {

    //a anotação get mapping vai em cima do método, ele vai informar que aquele método vai responder as
    // requisições http com o metodo/verbo GET

    @GetMapping("/")
    public String exibirTelaInicial() {
        return "Uma API para planejamento de viagens";
    }
    @GetMapping ("/retorno-html")
    public String testaRetornoComHtml() {
        String cabecalho = "<h1 style='color:red'>Aplicação clássica</h1>";
        String paragrafo = "<p>Esta mensagem é um parágrafo</p>";
        return cabecalho + paragrafo;
    }
}
