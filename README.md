# AppPadaria (PadariaSystem)

## Visão Geral

O **AppPadaria (PadariaSystem)** é um sistema desktop desenvolvido em Java para gerenciamento completo de uma padaria.  
Ele utiliza arquitetura em camadas com padrão **DAO (Data Access Object)**, separando claramente modelo, acesso a dados e interface gráfica.

O sistema permite o controle de clientes, fornecedores, produtos e pedidos, com interface gráfica e conexão com banco de dados.

---

## Estrutura do Projeto

```

PadariaSystem/
├── img content loaded
├── .idea/
├── libraries/
├── src/
├── .gitignore
├── misc.xml
├── modules.xml
├── vcs.xml
├── PadariaSystem.iml

```

---

## Arquitetura

O projeto segue uma estrutura organizada em camadas:

### Model
Responsável pelas entidades do sistema:
- Cliente  
- Endereço  
- Fornecedor  
- Produto  
- Pedido  
- ItemPedido  

---

### DAO
Camada responsável pelo acesso ao banco de dados:

- ClienteDAO  
- EnderecoDAO  
- FornecedorDAO  
- ProdutoDAO  
- PedidoDAO  
- ItemPedidoDAO  

Essa camada centraliza operações de:
- Inserção  
- Atualização  
- Exclusão  
- Consulta  

---

### Util
- **Conexao.java**: responsável pela conexão com o banco de dados

---

### View
Camada de interface gráfica do sistema:

- Telas de Cliente, Produto, Pedido, Fornecedor e Endereço  
- Tela principal (Home)  
- Componentes reutilizáveis como Sidebar e botões personalizados  

---

## Recursos Visuais

O sistema conta com recursos gráficos para melhorar a interface:

- Ícones de clientes, produtos, pedidos e fornecedores  
- Botões de ação (adicionar, editar, excluir)  
- Fontes personalizadas  
- Imagens de fundo e identidade visual  

---

## Funcionalidades

- Cadastro de clientes  
- Cadastro de fornecedores  
- Controle de produtos  
- Gerenciamento de pedidos  
- Associação de itens aos pedidos  
- Controle de endereços  
- Interface gráfica com navegação lateral  
- Operações completas de CRUD  

---

## Tecnologias Utilizadas

- Java  
- JDBC (acesso ao banco de dados)  
- Swing (interface gráfica)  
- Padrão DAO  
- Arquitetura em camadas  

---

## Objetivo do Sistema

O objetivo do **PadariaSystem** é simular um sistema completo de gestão para padarias, permitindo:

- Organização de estoque  
- Controle de vendas  
- Gerenciamento de clientes e fornecedores  
- Estruturação de pedidos  
- Interface gráfica funcional e modular  

---

## Observações

- Projeto desenvolvido em ambiente IntelliJ IDEA  
- Configurações internas estão na pasta `.idea`  
- Estrutura preparada para expansão e manutenção  
- Depende de banco de dados configurado via `Conexao.java`  

---
