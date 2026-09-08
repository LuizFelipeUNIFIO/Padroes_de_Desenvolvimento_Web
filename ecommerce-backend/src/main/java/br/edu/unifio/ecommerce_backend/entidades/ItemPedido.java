package br.edu.unifio.ecommerce_backend.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer quantidade;
    
    private BigDecimal valorUnitario;
    
    @ManyToOne
    private Pedido pedido;
    
    @ManyToOne
    private Produto produto;
}
