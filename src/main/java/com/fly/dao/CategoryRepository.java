package com.fly.dao;

import com.fly.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by misha on 29.07.16.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAll();
}
