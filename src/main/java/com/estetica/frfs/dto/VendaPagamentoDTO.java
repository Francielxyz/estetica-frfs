package com.estetica.frfs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaPagamentoDTO implements Serializable {

    @JsonProperty("venda_pagamento_PK_DTO")
    private VendaPagamentoPKDTO vendaPagamentoPKDTO;

    @JsonProperty("tipo_pagamento")
    private String tipoPagamento;

    @JsonProperty("observacao")
    private String observacao;

    @JsonProperty("data_cadastro")
    private Date dataCadastro;
}