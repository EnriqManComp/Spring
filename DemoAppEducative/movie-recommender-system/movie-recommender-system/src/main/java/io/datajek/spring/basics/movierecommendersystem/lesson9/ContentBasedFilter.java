package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    @Autowired
    private Movie movie;
    public ContentBasedFilter(){
        super();
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    public Movie getMovie(){
        return movie;
    }
    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
    @Override
    public String[] getRecommended(String movies) {
        return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
