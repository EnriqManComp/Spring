package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		// Filtro de recomendación de películas con tight coupling
		RecommenderImplementation recommender = new RecommenderImplementation();
		String [] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));

	}


}
