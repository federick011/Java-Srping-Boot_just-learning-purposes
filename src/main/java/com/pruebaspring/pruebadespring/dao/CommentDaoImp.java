package com.pruebaspring.pruebadespring.dao;


import com.pruebaspring.pruebadespring.models.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class CommentDaoImp implements CommentDao
{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void CreateComment(Comment comment)
    {
        entityManager.merge(comment);
    }

    @Override
    public void DeleteComment() {

    }

    @Override
    public List<Comment> ShowComment()
    {
        String Query = "FROM Comment";
        return entityManager.createQuery(Query).getResultList();
    }
}
