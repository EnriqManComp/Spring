package io.datajek.spring.basics.movierecommendersystem.lesson3;

public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommended(String movies)
    {
        return new String[] {"Finding Nemo","Ice Age","Shark Tale"};
    }
}
