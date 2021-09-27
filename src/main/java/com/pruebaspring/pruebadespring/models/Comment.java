package com.pruebaspring.pruebadespring.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
public class Comment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fecha")
    private LocalDate date;

    @Column(name = "comentario")
    private String CommentText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String commentText) {
        CommentText = commentText;
    }




}
