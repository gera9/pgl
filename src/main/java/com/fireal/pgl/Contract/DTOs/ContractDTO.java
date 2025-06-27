package com.fireal.pgl.Contract.DTOs;

import java.time.LocalDateTime;
import java.util.UUID;

public record ContractDTO(
                UUID id,
                String name,
                String description,
                UUID templateId,
                LocalDateTime createdAt) {

}
