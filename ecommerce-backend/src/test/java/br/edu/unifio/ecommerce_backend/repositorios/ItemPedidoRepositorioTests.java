package br.edu.unifio.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce_backend.entidades.ItemPedido;

@SpringBootTest 
public class ItemPedidoRepositorioTests {
    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired 
    private PedidoRepositorio pedidoRepositorio;

    @Autowired 
    private ProdutoRepositorio produtoRepositorio;

    @Test
    public void deveSalvarUmItemPedidoNovo() {
        var itemPedido = new ItemPedido();

        itemPedido.setQuantidade(10);
        itemPedido.setValorUnitario(new BigDecimal("2025.00"));

        var pedido = pedidoRepositorio.findById(1).orElseThrow();
        itemPedido.setPedido(pedido);

        var produto = produtoRepositorio.findById(1).orElseThrow(null);
        itemPedido.setProduto(produto);

        itemPedidoRepositorio.save(itemPedido);

        assertNotNull(itemPedido.getId());
        assertEquals(6, itemPedido.getId());
    }
}
