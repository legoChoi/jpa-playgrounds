package jpa.playgrounds.dto.response;

import jpa.playgrounds.entitiy.Comment;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class CommentResponseDto {

    private final Long id;
    private final String content;
    private final List<Comment> child = new ArrayList<>();
}
