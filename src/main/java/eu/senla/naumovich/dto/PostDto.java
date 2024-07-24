package eu.senla.naumovich.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
