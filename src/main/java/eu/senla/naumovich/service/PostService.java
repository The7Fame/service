package eu.senla.naumovich.service;

import eu.senla.naumovich.dto.PostCreateDto;
import eu.senla.naumovich.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final WebClient client;

    public List<PostDto> getAllPosts(){
        return client.get()
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<PostDto>>() {})
                .block();
    }

    public PostDto createPost(PostCreateDto laptopCreateDto){
        return client.post()
                .bodyValue(laptopCreateDto)
                .retrieve()
                .bodyToMono(PostDto.class)
                .block();
    }
}
