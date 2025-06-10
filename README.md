# CadastroPessoa

Uma aplicação gráfica simples desenvolvida em **Java com Swing**, voltada para o **cadastro de pessoas físicas e jurídicas**. Esta aplicação é apenas uma interface visual e não utiliza banco de dados, sendo ideal para fins didáticos ou demonstrações.

## 📋 Funcionalidades

- Cadastro de informações como CPF/CNPJ, nome, RG, e-mail, telefone, endereço, entre outros.
- Opção para selecionar o tipo de pessoa: Física ou Jurídica.
- Indicação de Fornecedor através de um `JCheckBox`.
- Escolha da Situação (Ativo/Inativo) usando `JRadioButton`.
- Botões de controle:
  - **Confirmar:** exibe uma mensagem de sucesso e limpa todos os campos.
  - **Excluir:** apaga todas as informações preenchidas.
  - **Limpar:** limpa os dados inseridos no formulário.

## 🖼️ Interface Gráfica

A interface é construída utilizando `JLabel`, `JTextField`, `JComboBox`, `JCheckBox`, `JRadioButton` e `JButton`. O posicionamento dos elementos é feito manualmente por meio de `null layout` com `setBounds()`.

## 🧠 Tecnologias Utilizadas

- Java SE
- Java Swing (para a interface gráfica)
- IDEs recomendadas: IntelliJ IDEA ou Eclipse

## 🚀 Como Executar

1. Faça o clone ou download deste repositório.
2. Compile e execute o arquivo `CadastroPessoa.java`:

```bash
javac CadastroPessoa.java
java CadastroPessoa
