package com.art.ufps.tictac.service;

import com.art.ufps.tictac.entity.Tema;

import java.util.List;
import java.util.Optional;

public interface TemaInterface {

    Optional<List<Tema>> getByEje(int eje);
}
