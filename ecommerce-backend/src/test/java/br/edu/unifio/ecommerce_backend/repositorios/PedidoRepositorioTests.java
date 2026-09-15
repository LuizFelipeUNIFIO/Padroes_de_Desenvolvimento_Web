package br.edu.unifio.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce_backend.entidades.Cliente;
import br.edu.unifio.ecommerce_backend.entidades.Pedido;

@SpringBootTest 
public class PedidoRepositorioTests {
    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test 
    public void deveSalvarUmPedidoNovo() {
        var pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("");
        pedido.setValorTotal(new BigDecimal("2026.00"));

        var cliente = clienteRepositorio.findById(1).orElseThrow();
        pedido.setCliente(cliente);

        pedidoRepositorio.save(pedido);

        assertNotNull(pedido.getId());
        assertEquals(6, pedido.getId());
    }
}
