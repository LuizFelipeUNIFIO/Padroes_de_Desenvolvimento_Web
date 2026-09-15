package br.edu.unifio.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce_backend.entidades.Cliente;

@SpringBootTest 
public class ClienteRepositorioTests {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveSalvarUmClienteNovo() {
        var cliente = new Cliente();

        cliente.setNome("Paulo");
        cliente.setEmail("Paulo@gmail.com");
        cliente.setTelefone("0211-1516");

        clienteRepositorio.save(cliente);

        assertNotNull(cliente.getId());
        assertEquals(6, cliente.getId());
    }
}
