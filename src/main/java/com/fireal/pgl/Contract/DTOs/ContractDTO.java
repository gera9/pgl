package com.fireal.pgl.Contract.DTOs;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fireal.pgl.Template.Template;

public record ContractDTO(
        UUID id,
        String name,
        String description,
        Template template,
        LocalDateTime createdAt) {

}
