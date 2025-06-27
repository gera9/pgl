package com.fireal.pgl.Template.DTOs;

import org.springframework.stereotype.Component;

import com.fireal.pgl.Template.Template;

@Component
public class TemplateMapper {
    public static TemplateDTO toDTO(Template template) {
        return new TemplateDTO(
                template.getId(),
                template.getName(),
                template.getDescription(),
                template.getHtml(),
                template.getContracts(),
                template.getCreatedAt());
    }

    public static Template toTemplate(TemplateDTO templateDTO) {
        return new Template(
                templateDTO.id(),
                templateDTO.name(),
                templateDTO.description(),
                templateDTO.html(),
                templateDTO.createdAt());
    }
}