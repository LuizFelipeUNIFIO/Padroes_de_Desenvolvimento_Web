package br.edu.unifio.ecommerce_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce_backend.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Integer>{

}
