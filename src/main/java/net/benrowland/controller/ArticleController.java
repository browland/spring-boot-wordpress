package net.benrowland.controller;

import net.benrowland.domain.Article;
import net.benrowland.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping("/")
    public Page<Article> home(Pageable pageRequest) {
        return articleRepository.findAll(pageRequest);
    }
}
