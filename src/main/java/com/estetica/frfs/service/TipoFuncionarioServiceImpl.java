package com.estetica.frfs.service;

import com.estetica.frfs.repository.TipoFuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TipoFuncionarioServiceImpl implements TipoFuncionarioService {

    private final TipoFuncionarioRepository tipoFuncionarioRepository;
}
