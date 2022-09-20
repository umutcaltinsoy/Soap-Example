package com.example.soap.service;

import com.example.soap.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

    Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
}
