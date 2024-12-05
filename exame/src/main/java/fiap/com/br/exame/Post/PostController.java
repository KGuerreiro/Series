package fiap.com.br.exame.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.web.bind.annotation.*;

import fiap.com.br.exame.Post.dto.PostRequest;
import fiap.com.br.exame.Serie.Serie;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private Series serieService;  // Serviço para buscar a série de TV

    @PostMapping
    public void createPost(@RequestBody PostRequest postRequest) {
        // Busca a série de TV pelo ID fornecido no PostRequest
        Serie serie = serieService.findById(postRequest.serieId());

        // Converte o PostRequest em um modelo Post e associa a série
        Post post = postRequest.toModel(serie);
        postService.save(post);
    }
}