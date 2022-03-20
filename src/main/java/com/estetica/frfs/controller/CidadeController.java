package com.estetica.frfs.controller;

import com.estetica.frfs.dto.CidadeDTO;
import com.estetica.frfs.dto.response.ReturnData;
import com.estetica.frfs.service.CidadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping("/salvar")
    @ResponseBody
    public ResponseEntity<Object> salvarCidade(@Validated @RequestBody CidadeDTO cidadeDTO) {
        ReturnData<Object> result = cidadeService.salvarCidade(cidadeDTO);

        return new ResponseEntity<>(result, result.getSuccess() ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
