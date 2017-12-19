package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import com.example.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
