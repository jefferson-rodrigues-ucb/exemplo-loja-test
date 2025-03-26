package main.java.br.ucb.entidade;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private LocalDateTime dataPedido;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    // TODO criar enum com status do pedido

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.dataPedido = LocalDateTime.now();
        this.produtos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public float calcularValorTotal() {
        float total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
