package net.benrowland.repository;

import net.benrowland.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface ArticleRepository extends Repository<Article, Long> {

    Page<Article> findAll(Pageable pageable);

}
