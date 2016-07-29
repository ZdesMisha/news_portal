package com.fly.controllers;

import com.fly.dao.NewsRepository;
import com.fly.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by misha on 29.07.16.
 */
@RestController
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @Value("${page.size}")
    private int pageSize;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public List<Post> getNews(@RequestParam(name = "page", required = false, defaultValue = "1") String page) {
        return newsRepository.findAll(new PageRequest(Integer.parseInt(page), pageSize));
    }
}
