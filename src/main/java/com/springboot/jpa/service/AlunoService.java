package com.springboot.jpa.service;

import com.springboot.jpa.mapper.AlunoMapper;
import com.springboot.jpa.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private AlunoMapper alunoMapper;
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoMapper alunoMapper, AlunoRepository alunoRepository) {
    }

}
