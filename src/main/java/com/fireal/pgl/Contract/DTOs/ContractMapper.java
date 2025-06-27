package com.fireal.pgl.Contract.DTOs;

import org.springframework.stereotype.Component;

import com.fireal.pgl.Contract.Contract;

@Component
public class ContractMapper {
    public static ContractDTO toDTO(Contract contract) {
        return new ContractDTO(
                contract.getId(),
                contract.getName(),
                contract.getDescription(),
                contract.getTemplateId(),
                contract.getCreatedAt());
    }

    public static Contract toContract(ContractDTO contractDTO) {
        return new Contract(
                contractDTO.id(),
                contractDTO.name(),
                contractDTO.description(),
                contractDTO.templateId());
    }
}