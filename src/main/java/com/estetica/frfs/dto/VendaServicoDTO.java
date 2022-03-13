package com.estetica.frfs.dto;

import com.estetica.frfs.entity.VendaServicoPK;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaServicoDTO implements Serializable {

    @JsonProperty("venda_servico_PK_DTO")
    private VendaServicoPKDTO vendaServicoPKDTO;

    @JsonProperty("quantidade")
    private Integer quantidade;

    @JsonProperty("valor_unitario")
    private Double valorUnitario;

    @JsonProperty("valor_total")
    private Double valorTotal;

    @JsonProperty("observacao")
    private String observacao;

    @JsonProperty("data_cadastro")
    private Date dataCadastro;
}