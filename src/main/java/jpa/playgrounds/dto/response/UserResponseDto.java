package jpa.playgrounds.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {

    private final Long id;
    private final String userName;
}
