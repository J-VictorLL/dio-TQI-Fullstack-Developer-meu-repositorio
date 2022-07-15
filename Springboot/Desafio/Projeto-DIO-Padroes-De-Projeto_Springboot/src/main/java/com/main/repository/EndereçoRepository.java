package com.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Endereço;

@Repository
public interface EndereçoRepository extends CrudRepository<Endereço, String>{

}
