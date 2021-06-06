package org.example.web.dto;

import lombok.Builder;
import lombok.Getter;
import org.example.domain.posts.Posts;

@Getter
public class PostsReponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsReponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
