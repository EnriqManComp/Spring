package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// For autowiring by type
// @Primary
@Qualifier("CF") // For autowiring using @Qualifier
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommended(String movies)
    {
        return new String[] {"Finding Nemo","Ice Age","Shark Tale"};
    }
}
