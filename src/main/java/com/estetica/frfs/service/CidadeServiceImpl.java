package com.estetica.frfs.service;

import com.estetica.frfs.exception.BusinessException;
import com.estetica.frfs.dto.CidadeDTO;
import com.estetica.frfs.dto.response.ReturnData;
import com.estetica.frfs.mapper.CidadeMapper;
import com.estetica.frfs.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    private CidadeMapper cidadeMapper;

    @Override
    public ReturnData<Object> salvarCidade(CidadeDTO cidadeDTO) {
        try {
            var cidade = cidadeRepository.save(cidadeMapper.toEntity(cidadeDTO));
            var cidadeSalva = cidadeMapper.toDto(cidade);
            return new ReturnData<>(true, "Cidade salvar com sucesso.", cidadeSalva);
        } catch (BusinessException busEx) {
            return new ReturnData<>(false, "Ocorreu um erro ao salvar uma cidade.", busEx.getMessage());
        } catch (Exception ex) {
            return new ReturnData<>(false, "Ocorreu um erro ao salvar uma cidade.", ex.getMessage() + "\nMotivo: " + ex.getCause());
        }
    }
}
