package com.springboot.jpa.service;

import com.springboot.jpa.mapper.DisciplinaMapper;
import com.springboot.jpa.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    private DisciplinaMapper disciplinaMapper;
    private DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaMapper disciplinaMapper, DisciplinaRepository disciplinaRepository) {

    }

}
