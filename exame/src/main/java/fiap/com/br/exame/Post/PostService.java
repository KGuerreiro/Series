package fiap.com.br.exame.Post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // Método para salvar um novo post
    public Post salvarPost(Post post) {
        // Você pode incluir lógicas adicionais aqui, como validações, antes de salvar o post
        return postRepository.save(post);  // Salva o post no banco de dados
    }

    // Método para buscar um post pelo ID
    public Post buscarPostPorId(Long id) {
        return postRepository.findById(id).orElse(null);  // Retorna o post ou null se não encontrado
    }

    // Método para excluir um post
    public void excluirPost(Long id) {
        postRepository.deleteById(id);  // Exclui o post do banco de dados
    }
}
