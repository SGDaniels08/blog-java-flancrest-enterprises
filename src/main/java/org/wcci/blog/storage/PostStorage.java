package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Post;
import org.wcci.blog.repositories.PostRepository;

@Service
public class PostStorage {

    // Instance Variable
    private PostRepository postRepo;

    // Constructor
    public PostStorage(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    // Getter
    public PostRepository getPostRepo() {
        return postRepo;
    }

    public Iterable<Post> findAllPosts() {
        return postRepo.findAll();
    }
}
