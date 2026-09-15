package br.edu.unifio.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce_backend.entidades.Categoria;

@SpringBootTest 
public class CategoriaRepositorioTests {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    public void deveSalvarUmaCategoriaNovo() {
        var categoria = new Categoria();
        categoria.setNome("Dlogas");
        categoria.setDescricao("Itens que ajudam no dia a dia!");

        categoriaRepositorio.save(categoria);

        assertNotNull(categoria.getId());
        assertEquals(6, categoria.getId());
    }
}
