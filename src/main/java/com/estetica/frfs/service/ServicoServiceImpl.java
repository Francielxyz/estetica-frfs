package com.estetica.frfs.service;

import com.estetica.frfs.repository.ServicoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServicoServiceImpl implements ServicoService {

    private final ServicoRepository servicoRepository;
}
