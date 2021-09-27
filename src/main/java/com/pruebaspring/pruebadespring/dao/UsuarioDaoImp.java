package com.pruebaspring.pruebadespring.dao;

import com.pruebaspring.pruebadespring.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements  UsuarioDao
{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> Prueba(long id) {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Usuario> GetUser() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Usuario> GetUser(long id) {
        String query = "FROM Usuario WHERE id = :id";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void Eliminar(long id)
    {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void Registrar(Usuario usuario)
    {
        entityManager.merge(usuario);
    }

    @Override
    public String MostarAlgo(int algo)
    {
        try
        {
            return algo + " y algo mas";
        }
        finally {
            return "Error";

        }

    }
}
