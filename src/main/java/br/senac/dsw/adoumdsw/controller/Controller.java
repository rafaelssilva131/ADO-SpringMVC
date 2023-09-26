package br.senac.dsw.adoumdsw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("curriculo")
public class Controller {

    @GetMapping
    public ModelAndView curriculo(){
        ModelAndView dados = new ModelAndView("index");
        dados.addObject("nome","Rafael de Souza Silva");
        dados.addObject("email","rafael.ssilva131@gmail.com");
        dados.addObject("github","https://github.com/rafaelssilva131");
        dados.addObject("endereco","Rua Geraldo Bretas 220");
        dados.addObject("telefone","(11)96033-2730");
        dados.addObject("instituicao","Centro Universitário SENAC - Santo Amaro");
        dados.addObject("curso","Análise e Desenvolvimento de Sistemas");
        dados.addObject("semestre","4° semestre");
        dados.addObject("periodo","inicio: 02/2022 fim: 06/2024");
        dados.addObject("resumo","Em busca da primeira oportunidade na área de desenvolvimento");

        return dados;
    }
}
