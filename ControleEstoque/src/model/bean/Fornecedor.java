package model.bean;

import java.util.*;

public class Fornecedor {
    
    private int idFornecedor;
    private String nome;
    private String responsavel;
    private int CNPJ;
    private int telefone;
    private int telefoneResponsavel;
    private int usuarioCadastro;
    private Date dataCadastro;

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(int telefoneresponsavel) {
        this.telefoneResponsavel = telefoneresponsavel;
    }

    public int getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(int usuariocadastro) {
        this.usuarioCadastro = usuariocadastro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
}
