package com.fireal.pgl.Template;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.relational.core.mapping.Table;

import com.fireal.pgl.BaseEntity;

@Table("TEMPLATES")
public class Template extends BaseEntity {
    private String description;
    private String html;

    public Template() {
    }

    public Template(UUID id, String name, String description, String html, LocalDateTime createdAt) {
        super(id, name, createdAt);
        this.description = description;
        this.html = html;
    }

    public Template(String name, String description, String html) {
        super(name);
        this.description = description;
        this.html = html;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
