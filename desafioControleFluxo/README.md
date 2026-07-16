# Desafio de Controle de Fluxo - Trilha Java Básico

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/DIO-%2300C4CC?style=for-the-badge" alt="DIO Badge"/>
</p>

Este repositório contém a resolução do desafio **Controle de Fluxo** proposto pela [Digital Innovation One (DIO)](https://www.dio.me) na trilha de Java Básico.

---

## 🎯 Objetivo do Desafio

O objetivo principal é exercitar o controle de fluxo em Java (estruturas de repetição e condicionais) e o tratamento de exceções customizadas.

O sistema recebe dois parâmetros via terminal (números inteiros) que representam uma contagem.
- **Lógica de Contagem:** Se os números informados forem, por exemplo, `12` e `30`, o sistema realizará um laço de repetição (`for`) com `18` ocorrências para imprimir os números incrementados: *"Imprimindo o número 1"*, *"Imprimindo o número 2"*, etc.
- **Validação de Entrada:** Se o primeiro parâmetro for **maior ou igual** ao segundo parâmetro, o sistema lançará a exceção customizada `ParametrosInvalidosException` com a mensagem: *"O segundo parâmetro deve ser maior que o primeiro"*.

