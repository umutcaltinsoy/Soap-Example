package com.example.soap.service;

import com.example.soap.model.Article;

import java.util.List;

public interface IArticleService {
    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Article article);
}
