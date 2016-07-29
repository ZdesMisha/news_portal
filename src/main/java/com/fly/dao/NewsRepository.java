package com.fly.dao;

import com.fly.entity.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by misha on 29.07.16.
 */
@Repository
public interface NewsRepository extends CrudRepository<Post, Long> {
    List<Post> findAll(Pageable pagable);
}
