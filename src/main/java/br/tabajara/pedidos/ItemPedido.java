/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tabajara.pedidos;

/**
 *
 * @author DELL
 */
public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public float valorTotal(){
        return this.quantidade*this.produto.getValorUnitario();
    }
    
}
