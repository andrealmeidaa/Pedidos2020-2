/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tabajara.principal;
import br.tabajara.pedidos.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("André Gustavo","andre@mail.com");
        Produto p1=new Produto(1, "Computador", 4500.50f);
        Produto p2=new Produto(2,"Monitor",876.45f);
        Produto p3=new Produto(3,"Mesa de Jantar 02",1256.25f);
        
        Pedido pedido01=new Pedido(cliente);
        
        pedido01.adicionarProduto(p2, 2);
        pedido01.adicionarProduto(p3, 1);
        
        System.out.println("O Valor total é "+pedido01.calcularValorTotal());
        
        if (pedido01.removerProduto(p3)){
            System.out.println("Item removido com sucesso");
        }else{
            System.out.println("Produto não localizado no pedido");
        }
        
        System.out.println("O Valor total é "+pedido01.calcularValorTotal());
    }
}
