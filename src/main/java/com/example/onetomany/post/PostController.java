package com.example.onetomany.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
public class PostController {
  

  @Autowired
  private PostRepository post_repository;


  @GetMapping("list-all")
  public Iterable<Post> listAll(){
    return post_repository.findAll();
  }


  @PostMapping("post-new") 
  public Post postNew(@RequestBody Post obj) {
    return post_repository.save(obj);
  }
}
