/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.abstractmodule.classframework;

import com.google.inject.AbstractModule;
import com.ifpb.exemplogoogleguice.abstractmodule.dao.LivroDao;
import com.ifpb.exemplogoogleguice.abstractmodule.dao.LivroDaoImpl;
import com.ifpb.exemplogoogleguice.abstractmodule.service.LivroService;
import com.ifpb.exemplogoogleguice.abstractmodule.service.LivroServiceImpl;

/**
 *
 * @author romulo
 */
public class MyAbstractModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(LivroDao.class).to(LivroDaoImpl.class);

        bind(LivroService.class).to(LivroServiceImpl.class);

    }

}
