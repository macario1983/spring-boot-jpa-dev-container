package com.springboot.jpa.service;

import com.springboot.jpa.mapper.SerieMapper;
import com.springboot.jpa.model.Serie;
import com.springboot.jpa.repository.SerieRepository;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SerieService {

    private SerieMapper serieMapper;
    private SerieRepository serieRepository;

    public SerieService(SerieMapper serieMapper, SerieRepository serieRepository) {

    }

}
