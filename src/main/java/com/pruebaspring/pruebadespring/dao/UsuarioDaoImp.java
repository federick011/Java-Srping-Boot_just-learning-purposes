package com.pruebaspring.pruebadespring.dao;

import com.pruebaspring.pruebadespring.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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
    public List<Usuario> GetUser(long id) {//parametro del WHERE
        String query = "FROM Usuario WHERE id = :id";


        return entityManager.createQuery(query)
                .setParameter("id", id)
                .getResultList();
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

        //Save password as value and then save into DB
        usuario.setPassword(hashPassword(usuario));
        entityManager.merge(usuario);
    }
    
    private  String hashPassword(Usuario usuario)
    {
        //Hashing password
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2d);
        String hash = argon2.hash(3, 1024, 1, usuario.getPassword());
        return hash;
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
