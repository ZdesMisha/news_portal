package com.fly.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by misha on 29.07.16.
 */
@Entity
@Table(name = "news")
public class Post {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "content")
    private String content;
    @Column(name = "author")
    private String author;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "news_categories",
            joinColumns = { @JoinColumn(name = "post_id") },
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private Set<Category> categories;

    public Post() {
    }

    public Post(Long id, String name, String content, String author,Set<Category> categories) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.author = author;
        this.categories=categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        return name != null ? name.equals(post.name) : post.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
