package jpa.playgrounds.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class PostResponseDto {

    private final Long id;
    private final String title;
    private final UserResponseDto user;
    private final List<CommentResponseDto> comments = new ArrayList<>();
}