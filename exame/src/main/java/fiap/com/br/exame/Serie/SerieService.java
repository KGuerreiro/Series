package fiap.com.br.exame.Serie;

import fiap.com.br.exame.Serie.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    // Criar uma nova série
    public Serie criarSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    // Buscar todas as séries
    public List<Serie> listarSeries() {
        return serieRepository.findAll();
    }

    // Buscar uma série por ID
    public Optional<Serie> obterSeriePorId(Long id) {
        return serieRepository.findById(id);
    }

    // Atualizar uma série existente
    public Serie atualizarSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    // Excluir uma série por ID
    public void excluirSerie(Long id) {
        serieRepository.deleteById(id);
    }
}