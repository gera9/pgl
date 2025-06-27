package com.fireal.pgl.Template.DTOs;

import java.time.LocalDateTime;
import java.util.UUID;

public record TemplateDTO(
        UUID id,
        String name,
        String description,
        String html,
        LocalDateTime createdAt) {

}
