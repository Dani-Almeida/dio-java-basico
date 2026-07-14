# 📺 Sistema Smart TV - Simulador de Controle Remoto

Projeto desenvolvido como parte do bootcamp **Java Básico** da [DIO (Digital Innovation One)](https://www.dio.me/).

## 📋 Descrição

Aplicação em Java que simula o funcionamento de uma Smart TV através de programação orientada a objetos. O sistema permite ligar/desligar a TV, alterar canais e controlar o volume, demonstrando conceitos fundamentais de POO como classes, objetos, métodos e atributos.

## 🚀 Funcionalidades

- **Ligar / Desligar** a TV
- **Aumentar e diminuir volume** com feedback no console
- **Mudar canal** para um canal específico
- **Aumentar e diminuir canal** sequencialmente
- Exibição do estado atual da TV (canal, volume, ligada/desligada)

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 11+)
- Conceitos de **Programação Orientada a Objetos (POO)**

## 📁 Estrutura do Projeto

```
sistema-smart-tv/
├── src/
│   ├── SmartTv.java     # Classe que representa a Smart TV (atributos e métodos)
│   └── Usuario.java     # Classe principal que simula o uso da TV
├── bin/                  # Arquivos compilados
├── lib/                  # Dependências
└── README.md
```

## 🧩 Classes

### `SmartTv`
Representa a televisão com seus atributos e comportamentos:

| Atributo   | Tipo      | Valor Padrão | Descrição                    |
|------------|-----------|--------------|------------------------------|
| `ligada`   | `boolean` | `false`      | Estado da TV (ligada/desligada) |
| `canal`    | `int`     | `1`          | Canal atual                  |
| `volume`   | `int`     | `25`         | Volume atual                 |

| Método             | Descrição                          |
|--------------------|------------------------------------|
| `ligar()`          | Liga a TV                          |
| `desligar()`       | Desliga a TV                       |
| `aumentarVolume()` | Aumenta o volume em 1             |
| `diminuirVolume()` | Diminui o volume em 1             |
| `mudarCanal(int)`  | Muda para um canal específico     |
| `aunentarCanal()`  | Avança para o próximo canal       |
| `diminuirCanal()`  | Retorna para o canal anterior     |

### `Usuario`
Classe principal (`main`) que instancia a `SmartTv` e simula interações do usuário.

## ▶️ Como Executar

1. Certifique-se de ter o **JDK 11** ou superior instalado
2. Navegue até a pasta do projeto:
   ```bash
   cd sistema-smart-tv
   ```
3. Compile os arquivos:
   ```bash
   javac -d bin src/*.java
   ```
4. Execute o programa:
   ```bash
   java -cp bin Usuario
   ```

## 💻 Exemplo de Saída

```
Diminuindo o volume para: 24
Diminuindo o volume para: 23
Diminuindo o volume para: 22
Aumentando o volume para: 23
Canal Atual: 1
Canal Atual: 13
Volume atual: 23
TV ligada? false
Volume atual: 23
Novo Status -> TV ligada? true
```

## 📚 Conceitos Praticados

- Programação Orientada a Objetos (POO)
- Criação de **classes** e **objetos**
- Definição de **atributos** e **métodos**
- **Instanciação** de objetos
- **Encapsulamento** de comportamentos

## 🎓 Bootcamp

Projeto desenvolvido durante o bootcamp **Java Básico** da [DIO](https://www.dio.me/).

---

Feito com ☕ por [Dani Almeida](https://github.com/Dani-Almeida)
