package com.github.yurivarao.citiesapi.countries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String name_pt;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public String getNome_pt() {
        return name_pt;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
