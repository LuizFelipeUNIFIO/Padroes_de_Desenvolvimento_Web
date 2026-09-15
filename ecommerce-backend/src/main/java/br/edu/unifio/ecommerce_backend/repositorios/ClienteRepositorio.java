package br.edu.unifio.ecommerce_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce_backend.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

}
