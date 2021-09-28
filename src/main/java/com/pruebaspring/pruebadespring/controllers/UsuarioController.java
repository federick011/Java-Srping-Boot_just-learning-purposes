package com.pruebaspring.pruebadespring.controllers;

import com.pruebaspring.pruebadespring.dao.UsuarioDao;
import com.pruebaspring.pruebadespring.dao.UsuarioDaoImp;
import com.pruebaspring.pruebadespring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(path = "api/")
public class UsuarioController implements UsuarioDao
{
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "prueba/{id}")
    public List<Usuario> Prueba(@PathVariable long id)
    {
        List<Usuario> Users = new ArrayList<>();

        Usuario _usuario = new Usuario();
        _usuario.setId(id);
        _usuario.setName("Andres");
        _usuario.setEmail("f@f.com");
        _usuario.setPassword("123456");

        Usuario _usuario01 = new Usuario();
        _usuario01.setId(id);
        _usuario01.setName("PEPR");
        _usuario01.setEmail("f@f.com");
        _usuario01.setPassword("123456");

        Users.add(_usuario);
        Users.add(_usuario01);
        return Users;
    }

    @RequestMapping(value = "pruebaget", method = RequestMethod.GET)
    public List<Usuario> GetUser()
    {
        return usuarioDao.GetUser();
    }

    @RequestMapping(value = "pruebaget/{id}", method = RequestMethod.GET)
    public List<Usuario> GetUser(@PathVariable long id) {
        return usuarioDao.GetUser(id);
    }

    @RequestMapping(value = "prueba01/{id}")
    public Usuario Editar(long id)
    {
        Usuario _usuario = new Usuario();
        _usuario.setName("Andres");
        _usuario.setEmail("f@f.com");
        _usuario.setPassword("123456");
        return _usuario;
    }

    @RequestMapping(value = "prueba02/{id}", method = RequestMethod.DELETE)
    public void Eliminar(@PathVariable long id)
    {
        usuarioDao.Eliminar(id);
    }


    @RequestMapping(value = "registrar", method = RequestMethod.POST)
    public void Registrar(@RequestBody Usuario usuario)
    {
        usuarioDao.Registrar(usuario);
    }

    @RequestMapping(value = "mostraralgo/{algo}")
    public String MostarAlgo(@PathVariable int algo)
    {
        return usuarioDao.MostarAlgo(algo);
    }
}
