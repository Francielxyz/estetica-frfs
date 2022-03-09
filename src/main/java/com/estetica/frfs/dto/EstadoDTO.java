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
public class EstadoDTO implements Serializable {

    @JsonProperty("name")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("sigla")
    private String sigla;

    @JsonProperty("data_cadastro")
    private Date dataCadastro;

    @JsonProperty("status")
    private String status = String.valueOf('A');
}