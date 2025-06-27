package com.fireal.pgl.Template.DTOs;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fireal.pgl.Contract.Contract;

public record TemplateDTO(
                UUID id,
                String name,
                String description,
                String html,
                List<Contract> contracts,
                LocalDateTime createdAt) {

}
