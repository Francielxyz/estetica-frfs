package com.estetica.frfs.service;

import com.estetica.frfs.dto.CidadeDTO;
import com.estetica.frfs.dto.response.ReturnData;

public interface CidadeService {

    ReturnData<Object> salvarCidade(CidadeDTO cidadeDTO);
}
