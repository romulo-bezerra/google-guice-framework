/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemplo.googleguice.app;

import br.edu.ifpb.exemplo.googleguice.controlador.LivroController;
import br.edu.ifpb.exemplo.googleguice.model.Livro;
import br.edu.ifpb.exemplo.googleguice.service.LivroService;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author romulo
 */
public class App {

    public static void main(String[] args) {

        // inicializa o injetor do guice
        Injector injector = Guice.createInjector();

        // recupera uma instancia de LivroService
        LivroService livroService = injector.getInstance(LivroService.class); 
        
        LivroController livroController = new LivroController(livroService);
        
        Livro livro = new Livro("O motorista e o milionário", "Joachim de Posada");
        
        System.out.println(livroController.adicionarLivro(livro));
        System.out.println(livroController.listarLivros());
        
    }

}
