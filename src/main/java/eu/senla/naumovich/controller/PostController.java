package eu.senla.naumovich.controller;

import eu.senla.naumovich.dto.PostCreateDto;
import eu.senla.naumovich.dto.PostDto;
import eu.senla.naumovich.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService service;

    @GetMapping
    public List<PostDto> getAllPhones(){
        return service.getAllPosts();
    }

    @PostMapping
    public PostDto createLaptop(@RequestBody PostCreateDto postCreateDto){
        return service.createPost(postCreateDto);
    }
}
