package main.java.br.ucb.controle;

import main.java.br.ucb.entidade.Pedido;

public class Vendas {
    // TODO criar vendas

    public static float venda(Pedido pedido) {
        System.out.println(pedido);
        return pedido.calcularValorTotal();
    }
}
