/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemplo.googleguice.controlador;

import br.edu.ifpb.exemplo.googleguice.model.Livro;
import br.edu.ifpb.exemplo.googleguice.service.LivroService;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author romulo
 */
public class LivroController {

    private final LivroService livroService;

    @Inject
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    public boolean adicionarLivro(Livro livro) {
        return livroService.getDao().save(livro);
    }

    public boolean removerLivro(Livro livro) {
        return livroService.getDao().remove(livro);
    }

    public List<Livro> listarLivros() {
        return livroService.getDao().findAll();
    }

}
