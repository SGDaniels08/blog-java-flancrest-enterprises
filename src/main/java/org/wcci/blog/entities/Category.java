package org.wcci.blog.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

public class Category {

    // Instance Variables
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany (mappedBy = "category")
    private Collection<Post> posts;

    // Constructors
    protected Category() {}

    public Category(String name) {
        this.name = name;
    }

    // Getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Collection<Post> getPosts() {
        return posts;
    }
}
