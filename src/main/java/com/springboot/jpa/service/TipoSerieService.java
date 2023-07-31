package com.springboot.jpa.service;

import com.springboot.jpa.mapper.TipoSerieMapper;
import com.springboot.jpa.repository.TipoSerieRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoSerieService {

    private TipoSerieMapper tipoSerieMapper;
    private TipoSerieRepository tipoSerieRepository;

    public TipoSerieService(TipoSerieMapper tipoSerieMapper, TipoSerieRepository tipoSerieRepository) {

    }

}
