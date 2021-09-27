package com.pruebaspring.pruebadespring.controllers;

import com.pruebaspring.pruebadespring.dao.CommentDao;
import com.pruebaspring.pruebadespring.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController implements CommentDao
{
    @Autowired
    private CommentDao commentDao;

    @RequestMapping(value = "createcomment", method = RequestMethod.POST)
    public void CreateComment(@RequestBody Comment comment)
    {
        commentDao.CreateComment(comment);
    }

    @RequestMapping(value = "deletecomment")
    public void DeleteComment()
    {
        commentDao.DeleteComment();
    }

    @RequestMapping(value = "showcomment", method = RequestMethod.GET)
    @Override
    public List<Comment> ShowComment()
    {
        return commentDao.ShowComment();

    }
}
