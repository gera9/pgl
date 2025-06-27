package com.fireal.pgl.Contract;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fireal.pgl.Contract.DTOs.ContractDTO;
import com.fireal.pgl.Contract.DTOs.ContractMapper;

@RestController
@RequestMapping(path = "/contracts")
@CrossOrigin(origins = "*")
public class ContractController {
    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ContractDTO> findAll(@RequestParam int offset, @RequestParam int limit,
            @RequestParam("sort") String sortProp) {
        return contractService.findAll(offset, limit, sortProp)
                .stream()
                .map(ContractMapper::toDTO)
                .collect(Collectors.toList());
    }
}
