package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args)
	{
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//use ApplicationContext to find which filter is being used
		//RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		RecommenderImplementation2 recommender = appContext.getBean(RecommenderImplementation2.class);


		String[] result = recommender.recommenderMovies("Finding Dory");

		System.out.println(Arrays.toString(result));

	}

}
