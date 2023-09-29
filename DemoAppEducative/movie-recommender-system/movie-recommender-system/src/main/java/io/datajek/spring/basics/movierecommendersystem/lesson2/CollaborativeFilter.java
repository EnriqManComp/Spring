package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
    public String[] getRecommended(String movies) {
        return new String[] {"Finding Nemo","Ice Age","Shark Tale"};
    }
}
