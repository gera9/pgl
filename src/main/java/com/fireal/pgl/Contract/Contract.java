package com.fireal.pgl.Contract;

import java.util.UUID;

import org.springframework.data.relational.core.mapping.Table;

import com.fireal.pgl.BaseEntity;
import com.fireal.pgl.Template.Template;

@Table("CONTRACTS")
public class Contract extends BaseEntity {
    private String description;
    private Template template;

    public Contract(UUID id, String name, String description, Template template) {
        super(id, name);
        this.description = description;
        this.template = template;
    }

    public Contract(String name, String description, Template template) {
        super(name);
        this.description = description;
        this.template = template;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}
