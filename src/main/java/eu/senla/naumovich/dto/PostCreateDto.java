package eu.senla.naumovich.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCreateDto {
    private Integer userId;
    private String title;
    private String body;
}
