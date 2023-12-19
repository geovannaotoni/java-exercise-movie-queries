package com.betrybe.consultafilmes;

import java.util.Map;
import java.util.Set;

public class Main {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Queries queries = new Queries(Movies.all());
    Set<String> resultados = queries.actorsThatInterpretThemselves();
    System.out.println(resultados);
    //    System.out.println(Movies.spaceJam2021.getActorsByCharacters());
    //    System.out.println(Movies.spaceJam2021.getActors());
    //    System.out.println(queries.actorsThatActedInMoviesOfDirectorInAlphabeticOrder("Mel Gibson"));
    //    System.out.println(queries.moviesWithAtLeastOneDirectorActedMostRecentFirst());
    //    System.out.println(queries.moviesReleasedInYearGroupedByCategory(2021));
    //    System.out.println(queries.actorsThatInterpretThemselves());
    //    System.out.println(queries.moviesByGivenYear(1940));
    //    Map<String, Set<String>> resultados2 = queries.selectMoviesByActor("Leonardo DiCaprio");
    //    System.out.println(resultados2);
  }
}
