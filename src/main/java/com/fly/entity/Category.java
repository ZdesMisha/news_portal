package com.fly.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by misha on 29.07.16.
 */
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "categories")
    private Set<Post> news;

    public Category() {
    }

    public Category(Long id, String name, Set<Post> news) {
        this.id = id;
        this.name = name;
        this.news = news;
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

    @JsonIgnore
    public Set<Post> getNews() {
        return news;
    }

    public void setNews(Set<Post> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return name != null ? name.equals(category.name) : category.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categories=" + news +
                ", news=" + news +
                '}';
    }
}
