package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;
    @Autowired
    // Using injection by constructor
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter){
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommenderMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        return filter.getRecommended("Finding Dory");
    }






}
