package com.fireal.pgl.Contract;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> findAll(int offset, int limit, String sortProp) {
        Sort sort;
        if (sortProp.length() > 1 && sortProp.charAt(0) == '-') {
            sort = Sort.by(sortProp.substring(1)).descending();
        } else {
            sort = Sort.by(sortProp);
        }

        PageRequest pageable = PageRequest.of(offset, limit, sort);

        return contractRepository.findAll(pageable)
                .stream()
                .toList();
    }
}
