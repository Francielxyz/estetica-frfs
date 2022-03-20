package com.estetica.frfs.service;

import com.estetica.frfs.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CidadeServiceImpl implements CidadeService {

    private final CidadeRepository cidadeRepository;
}
