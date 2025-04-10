# Tamagotchi
## Documentação do Projeto Tamagotchi em Java
### 1. Introdução
Este projeto tem como objetivo simular um Tamagotchi, um animal de estimação virtual, utilizando os princípios da Programação Orientada a Objetos (POO) em Java. O Tamagotchi é um sistema interativo em que o usuário pode interagir e cuidar de seu "pet", realizando ações como alimentar, brincar, dormir, envelhecer e cuidar de sua higiene. Além disso, um mini-jogo foi adicionado como uma funcionalidade opcional, permitindo que o Tamagotchi interaja com o usuário de uma maneira mais divertida.

### 2. Estrutura do Código
Classes Principais
O código é dividido em três classes principais:

Main.java: Contém o ponto de entrada do programa, onde o usuário interage com o Tamagotchi e escolhe as ações a serem realizadas.

Tamagotchi.java: Representa a entidade Tamagotchi e contém a lógica do jogo, incluindo as interações com o usuário, como alimentar, brincar, dormir, envelhecer, etc.

Status.java: Contém os atributos do Tamagotchi, como fome, felicidade, energia, saúde, idade, higiene e socialização. Esta classe também gerencia as atualizações do status e exibe as informações do Tamagotchi.

### 3. Descrição das Classes
Main.java
A classe Main.java é o ponto de entrada para o programa. Ela contém o método main e gerencia a interação com o usuário, oferecendo um menu com várias opções de ações. A cada escolha do usuário, um método correspondente da classe Tamagotchi é chamado para executar a ação.
Funções principais do Main.java:
Menu Interativo: Oferece ao usuário opções de ações.

Switch-case: Realiza as ações escolhidas pelo usuário chamando os métodos correspondentes da classe Tamagotchi.

Controle de fluxo: Permite que o programa continue executando até que o usuário escolha a opção de sair.

Tamagotchi.java
A classe Tamagotchi.java é a principal lógica do projeto. Ela gerencia os atributos e ações do Tamagotchi, como alimentar, brincar, envelhecer, cuidar da higiene, etc.
Funções principais da Tamagotchi.java:
Ações: Métodos como alimentar(), brincar(), dormir(), envelhecer(), e cuidarHigiene() manipulam os status do Tamagotchi.

Eventos aleatórios: O método eventoAleatorio() gera eventos negativos e positivos que afetam o Tamagotchi.

Mini-jogo: A função jogarMiniJogo() permite a interação com o Tamagotchi através de um jogo de adivinhação, onde o jogador tenta adivinhar um número.

Status.java
A classe Status.java gerencia os atributos do Tamagotchi, mantendo seu estado atual. Ela contém métodos para acessar e modificar esses atributos, além de exibir o status atual.
Funções principais do Status.java:
Atributos: Controla os atributos do Tamagotchi, como fome, felicidade, energia, saúde, idade, higiene e socialização.

Métodos de acesso: Métodos getters e setters para acessar e modificar os atributos.

Mostrar status: O método mostrarStatus() exibe os atributos do Tamagotchi no console.

### 4. Funcionalidades Opcionais
O projeto implementa um mini-jogo onde o Tamagotchi interage com o jogador tentando adivinhar um número. O número de tentativas e a dificuldade podem ser ajustados, tornando o jogo mais desafiador. Além disso, há feedback interativo e um sistema de pontuação baseado no número de tentativas restantes.
