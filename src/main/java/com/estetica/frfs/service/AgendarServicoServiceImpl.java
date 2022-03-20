package com.estetica.frfs.service;

import com.estetica.frfs.repository.AgendarServicoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AgendarServicoServiceImpl implements AgendarServicoService {

    private final AgendarServicoRepository agendarServicoRepository;
}
