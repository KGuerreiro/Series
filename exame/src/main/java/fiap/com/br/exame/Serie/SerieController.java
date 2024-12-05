package fiap.com.br.exame.Serie;


import fiap.com.br.exame.Serie.Serie;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    // 1. Listar todas as séries
    @GetMapping
    public List<Serie> listarSeries() {
        return serieService.listarSeries();
    }

    // 2. Buscar uma série por ID
    @GetMapping("/{id}")
    public ResponseEntity<Serie> obterSerie(@PathVariable Long id) {
        Optional<Serie> serie = serieService.obterSeriePorId(id);
        return serie.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 3. Criar uma nova série
    @PostMapping
    public ResponseEntity<Serie> criarSerie(@Valid @RequestBody Serie serie) {
        Serie novaSerie = serieService.criarSerie(serie);
        return ResponseEntity.status(201).body(novaSerie);
    }

    // 4. Atualizar uma série existente
    @PutMapping("/{id}")
    public ResponseEntity<Serie> atualizarSerie(@PathVariable Long id, @Valid @RequestBody Serie serie) {
        Optional<Serie> serieExistente = serieService.obterSeriePorId(id);
        if (serieExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        serie.setId(id); // Garantir que o ID da série seja mantido
        Serie serieAtualizada = serieService.atualizarSerie(serie);
        return ResponseEntity.ok(serieAtualizada);
    }

    // 5. Excluir uma série
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirSerie(@PathVariable Long id) {
        Optional<Serie> serie = serieService.obterSeriePorId(id);
        if (serie.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        serieService.excluirSerie(id);
        return ResponseEntity.noContent().build();
    }
}