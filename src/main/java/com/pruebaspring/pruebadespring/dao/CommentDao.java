package com.pruebaspring.pruebadespring.dao;

import com.pruebaspring.pruebadespring.models.Comment;

import java.util.List;

public interface CommentDao
{
    void CreateComment(Comment comment);
    void DeleteComment();
    List<Comment> ShowComment();

}
