/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author samus
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private String endereco;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = uf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
}
