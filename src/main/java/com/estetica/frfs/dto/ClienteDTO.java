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
public class ClienteDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("data_nascimento")
    private Date dataNascimento;

    @JsonProperty("telefone1")
    private String telefone1;

    @JsonProperty("telefone2")
    private String telefone2;

    @JsonProperty("email")
    private String email;

    @JsonProperty("observacao")
    private String observacao;

    @JsonProperty("data_cadastro")
    private Date dataCadastro;

    @JsonProperty("status")
    private String status = String.valueOf('A');

    @JsonProperty("cidade_DTO")
    private CidadeDTO cidadeDTO;
}