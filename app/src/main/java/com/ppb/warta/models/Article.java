package com.ppb.warta.models;

import java.util.List;

public class Article {
    private String status;
    private int totalResult;
    private List<Berita> articles;
    public Article(){}

    public Article(String status, int totalResult, List<Berita> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public List<Berita> getArticles() {
        return articles;
    }

    public void setArticles(List<Berita> articles) {
        this.articles = articles;
    }
}
