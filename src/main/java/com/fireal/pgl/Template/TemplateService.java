package com.fireal.pgl.Template;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {
    private final TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public List<Template> findAll(int offset, int limit, String sortProp) {
        Sort sort;
        if (sortProp.length() > 1 && sortProp.charAt(0) == '-') {
            sort = Sort.by(sortProp.substring(1)).descending();
        } else {
            sort = Sort.by(sortProp);
        }

        PageRequest pageable = PageRequest.of(offset, limit, sort);

        return templateRepository.findAll(pageable)
                .stream()
                .toList();
    }

    public UUID save(Template template) {
        return templateRepository.save(template).getId();
    }

    public Optional<Template> findById(UUID id) {
        return templateRepository.findById(id);
    }

    public Optional<UUID> updateById(UUID id) {
        var optTemplate = templateRepository.findById(id);
        if (optTemplate.isEmpty()) {
            return Optional.empty();
        }

        var templateToUpdate = optTemplate.get();

        var updatedId = templateRepository.save(templateToUpdate).getId();
        return Optional.of(updatedId);
    }

    public Optional<UUID> deleteById(UUID id) {
        try {
            templateRepository.deleteById(id);
            return Optional.of(id);
        } catch (OptimisticLockingFailureException e) {
            return Optional.empty();
        }
    }
}
