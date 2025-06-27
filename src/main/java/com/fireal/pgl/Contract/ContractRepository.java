package com.fireal.pgl.Contract;

import java.util.UUID;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends ListPagingAndSortingRepository<Contract, UUID> {

}
