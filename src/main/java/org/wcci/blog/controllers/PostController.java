package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wcci.blog.storage.PostStorage;

@Controller
public class PostController {

    // Instance Variables
    private PostStorage postStorage;

    // Constructor
    public PostController(PostStorage postStorage) {
        this.postStorage = postStorage;
    }

    // Getters
    public PostStorage getPostStorage() {
        return postStorage;
    }

    // Web Methods
    @GetMapping("/")
    public String showAllPosts(Model model) {
        model.addAttribute("posts", postStorage.findAllPosts());
        return "homepage-template";
    }
}