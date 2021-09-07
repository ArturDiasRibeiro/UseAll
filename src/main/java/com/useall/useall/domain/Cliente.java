package com.useall.useall.domain;

//Coded by: Artur Dias
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //Código do cliente, gerado automaticamente e inalterável

    @NotBlank(message = "Preencha o Nome")
    private String nome;

    @NotBlank(message = "Preencha o CNPJ")
    private String cnpj;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "Preencha a data no formato: DD/MM/AAAA")
    private Date dataCadastro;

    @NotBlank(message = "Preencha o Endereço")
    private String endereco;

    @NotBlank(message = "Preencha o Telefone")
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String cnpj, Date dataCadastro, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
