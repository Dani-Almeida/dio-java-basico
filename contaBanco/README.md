# 🏦 ContaBanco - Simulador de Conta Bancária

Projeto desenvolvido como parte do bootcamp **Java Básico** da [DIO (Digital Innovation One)](https://www.dio.me/).

## 📋 Descrição

Aplicação de terminal em Java que simula a criação de uma conta bancária. O programa solicita ao usuário informações como nome, agência, número da conta e saldo, e ao final exibe uma mensagem de confirmação com todos os dados informados.

## 🚀 Funcionalidades

- Entrada de dados do cliente via terminal utilizando a classe `Scanner`
- Coleta de informações:
  - **Nome** do titular
  - **Agência** bancária
  - **Número da conta**
  - **Saldo** inicial
- Exibição de mensagem formatada confirmando a criação da conta

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 11+)
- **Scanner** (`java.util.Scanner`) para entrada de dados

## 📁 Estrutura do Projeto

```
contaBanco/
├── src/
│   └── ContaTerminal.java    # Classe principal do programa
├── bin/                       # Arquivos compilados
├── lib/                       # Dependências
└── README.md
```

## ▶️ Como Executar

1. Certifique-se de ter o **JDK 11** ou superior instalado
2. Navegue até a pasta do projeto:
   ```bash
   cd contaBanco
   ```
3. Compile o arquivo:
   ```bash
   javac -d bin src/ContaTerminal.java
   ```
4. Execute o programa:
   ```bash
   java -cp bin ContaTerminal
   ```

## 💻 Exemplo de Uso

```
Por favor, digite seu nome!
Daniela
Por favor, digite o número da agência!
1234-5
Por favor, digite o numero da conta!
12345
Por favor, digite seu saldo!
1500.50
Olá, Daniela, obrigado por criar uma conta em nosso banco, sua agencia é 1234-5, conta 12345 e seu saldo 1500,50 já está disponível para saque.
```

## 📚 Conceitos Praticados

- Entrada e saída de dados no terminal
- Tipos de variáveis (`String`, `int`, `double`)
- Formatação de strings com `printf`
- Uso da classe `Scanner`

## 🎓 Bootcamp

Projeto desenvolvido durante o bootcamp **Java Básico** da [DIO](https://www.dio.me/).

---

Feito com ☕ por [Dani Almeida](https://github.com/Dani-Almeida)
