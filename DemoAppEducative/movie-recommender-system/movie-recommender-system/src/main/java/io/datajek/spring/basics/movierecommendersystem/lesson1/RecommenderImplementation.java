package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies (String movie){
        ContentBasedFilter filter = new ContentBasedFilter();

        return filter.getRecommendation(movie);
    }
}
