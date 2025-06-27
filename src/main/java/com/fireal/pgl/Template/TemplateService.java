package com.fireal.pgl.Template;

import java.util.List;

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
}
