package model.bean;

import java.util.*;

public class Fornecedor {
    
    private int idFornecedor;
    private String nome;
    private String responsavel;
    private String CNPJ;
    private String telefone;
    private String telefoneResponsavel;
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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneresponsavel) {
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
    
    @Override
    public String toString(){
        return getNome();
    }
    
}
