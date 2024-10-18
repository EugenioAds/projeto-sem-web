package br.com.eugenio.projeto01.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalrunTime") Integer totalMinutos,
                         @JsonAlias("imdbRating") String avaliacao) {
}
