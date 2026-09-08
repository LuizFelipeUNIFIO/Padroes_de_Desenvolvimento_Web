# 1. Categoria
INSERT into categoria (nome, descricao) VALUES ("Informática", "Produtos de Informática");

INSERT into categoria (nome, descricao) VALUES ("Livros", "Livros Técnicos");

INSERT into categoria (nome, descricao) VALUES ("Eletrônicos", "Aparelhos Eletrônicos");

INSERT into categoria (nome, descricao) VALUES ("Miniaturas", "Miniaturas de Formula 1");

INSERT into categoria (nome, descricao) VALUES ("Perfumes", "Perfumes Importados");

# 2. Produto
INSERT into produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Teclado", "Teclado Gamer 60% Switch Red", 99.90, 10, 1)

INSERT into produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Código Limpo", "Livro do Autor Robert C. Martin", 100.00, 20, 2)

INSERT into produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Poco X8 Pro", "Smartphone Intermediário Avançado", 2499.90, 5, 3)

INSERT into produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Oracle Red Bull Racing", "Miniatura Red Bull F1 1:43", 149.90, 3, 4)

INSERT into produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Lattafa Asad", "Masculino Fragrância Amadeirada 100ml", 199.90, 67, 5)

# 3. Cliente
INSERT into cliente (nome, email, telefone) VALUES ("Luiz Felipe", "Luiz@gmail.com", "4002-8922")

INSERT into cliente (nome, email, telefone) VALUES ("Felipe Luiz", "Felipe@gmail.com", "2020-2007")

INSERT into cliente (nome, email, telefone) VALUES ("Gaspar Silva", "Gaspar@gmail.com", "6767-6767")

INSERT into cliente (nome, email, telefone) VALUES ("Fernandes Gaspar", "Fernandes@gmail.com", "9920-9940")

INSERT into cliente (nome, email, telefone) VALUES ("Louiz", "Louiz@gmail.com", "2030-4050")

# 4. Pedido
INSERT into pedido (data, status, valor_total, cliente_id) VALUES ("2026-09-01", "Aguardando", 1019.90, 1)

INSERT into pedido (data, status, valor_total, cliente_id) VALUES ("2026-09-02", "Separação", 2019.90, 2)

INSERT into pedido (data, status, valor_total, cliente_id) VALUES ("2026-09-03", "Entregue", 3019.90, 3)

INSERT into pedido (data, status, valor_total, cliente_id) VALUES ("2026-09-04", "Cancelado", 4019.90, 4)

INSERT into pedido (data, status, valor_total, cliente_id) VALUES ("2026-09-05", "Reembolsado", 5019.90, 5)

# 5. ItemPedido
INSERT into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 101.90, 1, 1)

INSERT into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (2, 303.80, 2, 2)

INSERT into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (3, 606.80, 3, 3)

INSERT into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (4, 503.80, 4, 4)

INSERT into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (5, 252.90, 5, 5)

# 6. Pagamento
INSERT into pagamento (valor, data, status, tipo, pedido_id) VALUES (1019.90, "2026-09-07", "Aguardando", "Boleto", 1)

INSERT into pagamento (valor, data, status, tipo, pedido_id) VALUES (2019.90, "2026-09-08", "Aguardando", "Pix", 2)

INSERT into pagamento (valor, data, status, tipo, pedido_id) VALUES (3019.90, "2026-09-09", "Aguardando", "Cartão de Crédito", 3)

INSERT into pagamento (valor, data, status, tipo, pedido_id) VALUES (4019.90, "2026-09-10", "Aguardando", "Criptomoeda", 4)

INSERT into pagamento (valor, data, status, tipo, pedido_id) VALUES (5019.90, "2026-09-11", "Aguardando", "Ted", 5)