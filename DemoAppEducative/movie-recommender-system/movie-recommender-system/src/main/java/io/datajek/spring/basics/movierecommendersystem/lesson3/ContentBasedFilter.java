package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommended(String movies) {
        return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
