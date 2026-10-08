package com.sprint.mission.discodeit.dto.Response;


import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
// todo toDto 메서드 수정필요
public record UserDto(
        UUID id,
        String username,
        String email,
        BinaryContentDto profile,
        boolean online
) {

}
