package com.estetica.frfs.controller;

import com.estetica.frfs.service.TipoFuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("tipo-funcionario")
public class TipoFuncionarioController {

    @Autowired
    private TipoFuncionarioService tipoFuncionarioService;
}
