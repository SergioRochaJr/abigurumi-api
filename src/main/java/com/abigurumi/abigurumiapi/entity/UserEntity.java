package com.abigurumi.abigurumiapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id; // Substituí @GeneratedValue por @Id para usar celular como chave
import jakarta.persistence.Column;

@Entity
public class UserEntity {
    @Id
    @Column(unique = true, nullable = false)
    private String celular;
    private String nome;
    private String dataNascimento;
    private String senha;
    private String preferencia;
    private int valorProduto;

    // Getters, setters e construtores
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getPreferencia() { return preferencia; }
    public void setPreferencia(String preferencia) { this.preferencia = preferencia; }
    public int getValorProduto() { return valorProduto; }
    public void setValorProduto(int valorProduto) { this.valorProduto = valorProduto; }
}