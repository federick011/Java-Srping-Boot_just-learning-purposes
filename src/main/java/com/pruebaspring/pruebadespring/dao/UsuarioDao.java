package com.pruebaspring.pruebadespring.dao;

import com.pruebaspring.pruebadespring.models.Usuario;

import java.util.List;

public interface UsuarioDao
{
    List<Usuario> Prueba(long id);
    List<Usuario> GetUser();
    List<Usuario> GetUser(long id);
    void Eliminar(long id);
    void Registrar(Usuario usuario);
    String MostarAlgo(int algo);

}
