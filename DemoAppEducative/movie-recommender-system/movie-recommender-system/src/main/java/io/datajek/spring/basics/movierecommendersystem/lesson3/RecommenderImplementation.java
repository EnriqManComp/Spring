package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String[] recommenderMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        return filter.getRecommended("Finding Dory");
    }






}
