package fiap.com.br.exame.Post.dto;

import java.time.LocalDateTime;

import fiap.com.br.exame.Post.Post;
import fiap.com.br.exame.Serie.Serie;

public record PostRequest(String text, Long serieId) {

    // Método que converte o PostRequest em um modelo Post
    public Post toModel(Serie serie) {
        return Post.builder()
                .text(text)              // Atribui o texto do post
                .createdAt(LocalDateTime.now()) // Define a data de criação
                .serie(serie)            // Associa a série recebida ao post
                .build();
    }
}
