package com.pruebaspring.pruebadespring.models;

import javax.persistence.*;

@Entity//Para decirle que es una entidad que hara refencia a la base e datos
@Table(name = "usuarios")//Esto es para decirle a esta clase a la tabla que tiene que acceder
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "email")
    private String Email;

    @Column(name = "password")
    private String password;

    public long getId() {
        return this.Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
