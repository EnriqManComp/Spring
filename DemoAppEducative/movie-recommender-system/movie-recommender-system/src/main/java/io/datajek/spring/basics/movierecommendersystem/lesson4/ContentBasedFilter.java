package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommended(String movies) {
        return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
