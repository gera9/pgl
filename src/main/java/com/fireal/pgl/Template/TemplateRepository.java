package com.fireal.pgl.Template;

import java.util.UUID;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends ListPagingAndSortingRepository<Template, UUID> {

}
