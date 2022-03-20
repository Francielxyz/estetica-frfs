package com.estetica.frfs.service;

import com.estetica.frfs.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VendaServiceImpl implements VendarService {

    private final VendaRepository vendaRepository;
}
