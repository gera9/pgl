package com.fireal.pgl.Template;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fireal.pgl.Template.DTOs.TemplateDTO;
import com.fireal.pgl.Template.DTOs.TemplateMapper;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(path = "/templates")
@CrossOrigin(origins = "*")
public class TemplateController {
    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public UUID save(@RequestBody TemplateDTO templateDTO) {
        return templateService.save(TemplateMapper.toTemplate(templateDTO));
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

    @GetMapping("/{id}")
    public ResponseEntity<TemplateDTO> findById(@PathVariable UUID id) {
        var opt = templateService.findById(id);
        if (opt.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(TemplateMapper.toDTO(opt.get()), HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UUID> updateById(@PathVariable UUID id, @RequestBody TemplateDTO templateDTO) {
        var opt = templateService.updateById(id);
        if (opt.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(opt.get(), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable UUID id) {
        var opt = templateService.deleteById(id);
        if (opt.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
