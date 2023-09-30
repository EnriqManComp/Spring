package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // Using autowiring by name
    //private Filter contentBasedFilter;
    // Using @Qualifier for autowiring
    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public String[] recommenderMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        return filter.getRecommended("Finding Dory");
    }






}
