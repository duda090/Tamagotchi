# 🐣 Projeto Tamagotchi – Java Console

Este projeto simula um **Tamagotchi**, um bichinho virtual interativo, com várias ações e estados que mudam conforme o usuário interage com ele. É uma forma divertida de aprender e aplicar conceitos de **POO (Programação Orientada a Objetos)** em Java.

## 👨‍💻 Desenvolvedores

- Leonardo Alvarenga Ferreira
- Eduarda Andrade de Sousa
- Amanda Soares Pereira
- Aline dos Reis Furtado

## 📚 Conteúdo

- Menu interativo com Scanner
- Classe `Tamagotchi` com comportamentos
- Classe `Status` com atributos e métodos de controle
- Eventos aleatórios com consequências
- Mini-jogo simples para aumentar felicidade
- Sistema de idade, saúde e socialização

---

## 🚀 Como Executar o Projeto

1. Clone ou baixe o projeto para sua máquina.
2. Abra em uma IDE como IntelliJ, Eclipse ou VS Code com extensão de Java.
3. Compile e execute a classe `Main.java`.

---

## 🧠 Lógica do Jogo

### 🐾 Classe `Status`

Essa classe representa os **atributos do Tamagotchi**:

- `fome`: nível de fome (0 a 100)
- `felicidade`: estado emocional (0 a 100)
- `energia`: disposição (0 a 100)
- `idade`: idade do Tamagotchi
- `saude`: booleano indicando se está saudável
- `higiene`: higiene geral (0 a 100)
- `socializacao`: booleano que reflete se está socializando bem

Inclui métodos `get` e `set`, e o método `mostrarStatus()` que imprime todos os atributos.

---

### 🧸 Classe `Tamagotchi`

Possui métodos que alteram os atributos do `Status`, como:

- `alimentar()`: reduz fome
- `brincar()`: aumenta felicidade, mas reduz energia
- `dormir()`: restaura energia
- `cuidarHigiene()`: melhora higiene
- `envelhecer()`: incrementa idade
- `jogarMiniJogo()`: desafio simples de adivinhação para ganhar felicidade

Além disso, existe o método:

- `eventoAleatorio()`: simula situações aleatórias que podem afetar o bichinho (ex: ficar doente, ficar mais cansado, etc.)

> ⚠️ Agora os eventos aleatórios só acontecem **após ações específicas**, como brincar, dormir, envelhecer ou jogar, e **não** após alimentar ou cuidar da higiene.

---

## 📋 Menu Principal

Exibido no console:

1 - Alimentar
2 - Brincar
3 - Dormir
4 - Verificar Status
5 - Envelhecer
6 - Cuidar da Higiene
7 - Sair
8 - Jogar Mini-Jogo


---

## 🎮 Mini-Jogo: Adivinha o Número

Ao escolher a opção 8, o usuário participa de um jogo simples onde deve adivinhar um número entre 1 e 5. Acertando, ganha felicidade extra!

---

## 🛠 Requisitos

- Java 8 ou superior
- Terminal ou console com suporte a entrada de dados

---

## 📝 Possíveis Melhorias Futuras

- Interface gráfica (Swing ou JavaFX)
- Sistema de salvamento e carregamento
- Inventário de itens
- Evolução do Tamagotchi

---

## 📌 Observações

Esse projeto foi desenvolvido com fins educacionais, como forma de aplicar os conceitos básicos de orientação a objetos, lógica condicional, laços de repetição e boas práticas de programação.

---

💡 *“Cuidar do Tamagotchi é como programar: se você não prestar atenção, ele entra em colapso!”*