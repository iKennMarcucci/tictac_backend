package com.art.ufps.tictac.service.implement;

import com.art.ufps.tictac.entity.Tema;
import com.art.ufps.tictac.repository.TemaRepository;
import com.art.ufps.tictac.service.TemaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemaService implements TemaInterface {

    private final TemaRepository temaRepository;

    @Autowired
    public TemaService(TemaRepository temaRepository) {
        this.temaRepository = temaRepository;
    }

    public Optional<List<Tema>> getByEje(int eje){
        return temaRepository.findAllByIdLinea(eje);
    }
}
