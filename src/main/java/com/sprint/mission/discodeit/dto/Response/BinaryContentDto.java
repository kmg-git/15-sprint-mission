package com.sprint.mission.discodeit.dto.Response;

import java.util.UUID;

public record BinaryContentDto(
        UUID id,
        String fileName,
        Long size,
        String contentType
) {
}
