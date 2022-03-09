package com.estetica.frfs.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estado")
@EqualsAndHashCode
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "nome", length = 300)
    private String nome;

    @NotNull
    @Column(name = "sigla", length = 300)
    private String sigla;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Column(name = "status", length = 1)
    private String status;
}