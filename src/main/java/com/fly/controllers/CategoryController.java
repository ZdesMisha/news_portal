package com.fly.controllers;

import com.fly.dao.CategoryRepository;
import com.fly.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by misha on 29.07.16.
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
