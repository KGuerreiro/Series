package fiap.com.br.exame.Serie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import fiap.com.br.exame.Serie.Serie;

@Data
@Builder
@AllArgsConstructor
public class SerieResponse {

    private Long id;
    private String nome;
    private String genero;
    private Integer anoLancamento;
    private Integer quantidadeTemporadas;
    private String classificacaoIndicativa;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Método para transformar um modelo Serie em SerieResponse
    public static SerieResponse from(Serie serie) {
        return SerieResponse.builder()
                .id(serie.getId())
                .nome(serie.getNome())
                .genero(serie.getGenero())
                .anoLancamento(serie.getAnoLancamento())
                .quantidadeTemporadas(serie.getQuantidadeTemporadas())
                .classificacaoIndicativa(serie.getClassificacaoIndicativa())
                .createdAt(serie.getCreatedAt())
                .updatedAt(serie.getUpdatedAt())
                .build();
    }
}

