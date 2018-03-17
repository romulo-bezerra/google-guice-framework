/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemplo.googleguice.service;

import br.edu.ifpb.exemplo.googleguice.dao.LivroDao;
import com.google.inject.Inject;

/**
 *
 * @author romulo
 */
public class LivroServiceImpl implements LivroService {

    private final LivroDao livroDao;

    @Inject
    public LivroServiceImpl(LivroDao livroDao) {
        this.livroDao = livroDao;
    }

    @Override
    public LivroDao getDao() {
        return livroDao;
    }

}
