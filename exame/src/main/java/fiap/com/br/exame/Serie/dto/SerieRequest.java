package fiap.com.br.exame.Serie.dto;

import java.time.LocalDateTime;

import fiap.com.br.exame.Serie.Serie;

public record SerieRequest(
        String nome,
        String genero,
        Integer anoLancamento,
        Integer quantidadeTemporadas,
        String classificacaoIndicativa
) {
    // Método para converter o SerieRequest para um modelo de Serie
    public Serie toModel() {
        return Serie.builder()
                .nome(nome)
                .genero(genero)
                .anoLancamento(anoLancamento)
                .quantidadeTemporadas(quantidadeTemporadas)
                .classificacaoIndicativa(classificacaoIndicativa)
                .createdAt(LocalDateTime.now())  // A data de criação é gerada no momento da criação
                .updatedAt(LocalDateTime.now())  // A data de atualização também é gerada na criação
                .build();
    }
}
