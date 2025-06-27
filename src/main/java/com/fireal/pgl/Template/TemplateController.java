package com.fireal.pgl.Template;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fireal.pgl.Template.DTOs.TemplateDTO;
import com.fireal.pgl.Template.DTOs.TemplateMapper;

@RestController
@RequestMapping(path = "/templates")
@CrossOrigin(origins = "*")
public class TemplateController {
    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TemplateDTO> findAll(@RequestParam int offset, @RequestParam int limit,
            @RequestParam("sort") String sortProp) {
        return templateService.findAll(offset, limit, sortProp)
                .stream()
                .map(TemplateMapper::toDTO)
                .collect(Collectors.toList());
    }
}
