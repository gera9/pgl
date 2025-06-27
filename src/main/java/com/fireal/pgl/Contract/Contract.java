package com.fireal.pgl.Contract;

import java.util.UUID;

import org.springframework.data.relational.core.mapping.Table;

import com.fireal.pgl.BaseEntity;

@Table("CONTRACTS")
public class Contract extends BaseEntity {
    private String description;
    private UUID templateId; // FK to parent

    public Contract() {
    }

    public Contract(UUID id, String name, String description, UUID templateId) {
        super(id, name);
        this.description = description;
        this.templateId = templateId;
    }

    public Contract(String name, String description, UUID templateId) {
        super(name);
        this.description = description;
        this.templateId = templateId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getTemplateId() {
        return templateId;
    }

    public void setTemplateId(UUID templateId) {
        this.templateId = templateId;
    }
}
