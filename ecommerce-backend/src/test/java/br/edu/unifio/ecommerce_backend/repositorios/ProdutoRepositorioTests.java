package br.edu.unifio.ecommerce_backend.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import br.edu.unifio.ecommerce_backend.entidades.Categoria;
import br.edu.unifio.ecommerce_backend.entidades.Produto;

@SpringBootTest 
public class ProdutoRepositorioTests {
    @Autowired 
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test 
    public void deveSalvarUmProdutoNovo() {
        var produto = new Produto();
        produto.setNome("Poco X8 Pro");
        produto.setDescricao("Um smartphone de alta potencia com 512g ROM e 12g RAM");
        produto.setPreco(new BigDecimal("2599.90"));
        produto.setEstoque(Short.parseShort("10"));
        
        var categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        produtoRepositorio.save(produto);

        assertNotNull(produto.getId());
        assertEquals(6, produto.getId());
    }

    @Test
    public void deveBuscarUmProduto() {
        Produto produto = produtoRepositorio.findById(Integer.parseInt("3")).orElseThrow();
        assertNotNull(produto);
        assertEquals("Poco X8 Pro", produto.getNome());
    }

    @Test
    public void deveBuscarTodosOsProdutos() {
        List<Produto> produtos = produtoRepositorio.findAll(Sort.by("nome") );

        assertEquals(7, produtos.size());
        assertEquals("Código Limpo", produtos.get(0).getNome());

    }

    @Test 
    public void deveExcluirUmProdutoPorId() {
        var produto = new Produto();
        produto.setNome("Nome Teste");
        produto.setDescricao("Teste");
        produto.setPreco(new BigDecimal("00.00"));
        produto.setEstoque(Short.parseShort("0"));
        
        Categoria categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        produtoRepositorio.save(produto);

        assertTrue(produtoRepositorio.existsById(produto.getId()));
        produtoRepositorio.deleteById(produto.getId());
        assertFalse(produtoRepositorio.existsById(produto.getId()));
    }

    @Test
    public void deveAtualizarONomeDeUmProduto() {
        var produto = new Produto();
        produto.setNome("Nome Teste");
        produto.setDescricao("Teste");
        produto.setPreco(new BigDecimal("00.00"));
        produto.setEstoque(Short.parseShort("0"));
        
        Categoria categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        produtoRepositorio.save(produto);

        produto.setNome("Outro Nome Teste");

        produtoRepositorio.save(produto);

        assertEquals("Outro Nome Teste", produtoRepositorio.findById(produto.getId()).orElseThrow().getNome());
    }
}
