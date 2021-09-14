package com.example.sping_portfolio.functions;

public class news {
    //protected data
    private String article_name;
    private int rating;
    private int review_total;

    //constructor
    public news(String article_name, int rating, int review_total){
        this.article_name = article_name;
        this.rating = rating;
        this.review_total = review_total;
    }

    //getters
    public String getArticle_name(){
        return article_name;
    }

    public int getRating(){
        return rating;
    }

    public int getReview_total(){
        return review_total;
    }
}
