package com.art.ufps.tictac.repository;

import com.art.ufps.tictac.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {

    Optional<List<Tema>> findAllByIdLinea(int i);
}
