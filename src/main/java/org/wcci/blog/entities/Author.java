package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Author {

    // Instance Variables
    @Id
    @GeneratedValue
    private long id;
    private String userName;
    @OneToMany(mappedBy = "author")
    private Collection<Post> posts;

    // Constructors
    protected Author() {}

    public Author(String userName) {
        this.userName = userName;
    }

    // Getters
    public long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public Collection<Post> getPosts() {
        return posts;
    }
}
