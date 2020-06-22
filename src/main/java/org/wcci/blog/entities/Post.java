package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Post {

    // Instance Variables
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private Author author;
    private LocalDateTime publishDate;
    private String body;
    private Category category;
    private Collection<Tag> tags;

    // Constructors
    protected Post() {}

    public Post(String title, Author author, LocalDateTime publishDate, String body, Category category, Tag... tags) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.body = body;
        this.category = category;
        this.tags = new ArrayList<>(Arrays.asList(tags));
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public LocalDateTime getPublishDate() {
        return publishDate;
    }
    public String getBody() {
        return body;
    }
    public Collection<Tag> getTags() {
        return tags;
    }

}
