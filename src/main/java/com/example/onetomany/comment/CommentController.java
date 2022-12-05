package com.example.onetomany.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {


  @Autowired
  private CommentRepository comment_repository;

  @GetMapping("list-all")
  public Iterable<Comment> listAll() {
    return comment_repository.findAll();  
  }

  @PostMapping("post-new")
  public Comment postNew(@RequestBody Comment obj) {
    return comment_repository.save(obj);
  }



  
}
