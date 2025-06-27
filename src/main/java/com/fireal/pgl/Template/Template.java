package com.fireal.pgl.Template;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import com.fireal.pgl.BaseEntity;
import com.fireal.pgl.Contract.Contract;

@Table("TEMPLATES")
public class Template extends BaseEntity {
    private String description;
    private String html;

    @MappedCollection(idColumn = "TEMPLATE_ID", keyColumn = "ID") // FK in child table
    private List<Contract> contracts = new ArrayList<>();

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

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
