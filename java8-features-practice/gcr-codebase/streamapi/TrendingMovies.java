package streamapi;

import java.util.*;

class Movie{
    String name;
    double rating;
    int releaseYear;
    Movie(String name,double rating,int releaseYear){
        this.name=name;
        this.rating=rating;
        this.releaseYear=releaseYear;
    }
    public double getRating(){
        return rating;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public String toString(){
        return name+" | Rating: "+rating+" | Year: "+releaseYear;
    }
}

public class TrendingMovies{
    public static void main(String[] args){
        List<Movie> movies=Arrays.asList(
            new Movie("Movie A",8.9,2024),
            new Movie("Movie B",9.1,2023),
            new Movie("Movie C",8.7,2025),
            new Movie("Movie D",9.3,2024),
            new Movie("Movie E",8.5,2022),
            new Movie("Movie F",9.0,2025),
            new Movie("Movie G",8.2,2021)
        );

        movies.stream()
              .filter(m->m.getRating()>=8.5)
              .sorted((m1,m2)->{
                  int ratingCompare=Double.compare(m2.getRating(),m1.getRating());
                  return ratingCompare!=0?ratingCompare:
                         Integer.compare(m2.getReleaseYear(),m1.getReleaseYear());
              })
              .limit(5)
              .forEach(System.out::println);
    }
}
