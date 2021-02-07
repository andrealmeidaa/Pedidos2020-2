/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tabajara.pedidos;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItemPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.listaItemPedido=new ArrayList<ItemPedido>();
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void adicionarProduto(Produto produto, int quantidade){
        ItemPedido item=new ItemPedido(quantidade,produto);
        this.listaItemPedido.add(item);
    }
    public float calcularValorTotal(){
        float valorTotal=0;
        //Estrutura foreach
        for (ItemPedido itemPedido : this.listaItemPedido) {
            valorTotal=valorTotal+itemPedido.valorTotal();
        }
        return valorTotal;
    }
    public boolean removerProduto(Produto produto){
        int indice=0;
        for (ItemPedido itemPedido : this.listaItemPedido) {
            if (itemPedido.getProduto().getCodigo()==produto.getCodigo()){
                this.listaItemPedido.remove(indice);
                return true;
            }
            indice++;
        }
        return false;
    }
    
}
