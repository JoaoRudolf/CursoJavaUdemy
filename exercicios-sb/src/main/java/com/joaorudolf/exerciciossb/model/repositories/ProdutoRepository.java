package com.joaorudolf.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.joaorudolf.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}
