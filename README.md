# Filas e Pilhas em Java

Exercício desenvolvido em **Java** para demonstrar o funcionamento de duas estruturas de dados fundamentais:

* **Fila (Queue)** — baseada no princípio FIFO;
* **Pilha (Stack)** — baseada no princípio LIFO.

Para a implementação, foi utilizada a classe `ArrayDeque`, uma estrutura da biblioteca padrão do Java que pode ser utilizada tanto como fila quanto como pilha.

---

## Objetivo

O objetivo do exercício é compreender na prática como funcionam as operações de **inserção e remoção** em filas e pilhas.

O programa simula:

1. Uma fila de atendimento de um banco;
2. Uma pilha de números.

Dessa forma, é possível observar a diferença entre os princípios **FIFO** e **LIFO**.

---

# Estruturas de Dados

## Fila — FIFO

FIFO significa:

**First In, First Out**

Ou seja:

> O primeiro elemento que entra é o primeiro elemento que sai.

Exemplo:

```text
ENTRADA

Ana
 ↓
Bruno
 ↓
Carla

SAÍDA

Ana → Bruno → Carla
```

Como `Ana` entrou primeiro, ela será a primeira pessoa atendida.

---

## Pilha — LIFO

LIFO significa:

**Last In, First Out**

Ou seja:

> O último elemento que entra é o primeiro elemento que sai.

Exemplo:

```text
        TOPO
         ↓
        30
        20
        10
```

Como `30` foi o último número inserido, ele será o primeiro a ser removido.

---

# Bibliotecas utilizadas

O programa utiliza:

```java
import java.util.ArrayDeque;
import java.util.Queue;
```

### `Queue`

A interface `Queue` representa uma estrutura de dados do tipo **fila**.

No programa, ela é utilizada para armazenar as pessoas que aguardam atendimento.

### `ArrayDeque`

`ArrayDeque` é uma implementação de uma fila dupla (**double-ended queue/deque**) e pode ser utilizada tanto para operações de fila quanto de pilha.

No exercício, ela é utilizada:

* Como `Queue` para representar a fila;
* Diretamente como `ArrayDeque` para representar a pilha.

---

# Classe principal

O programa possui a classe:

```java
public class filas {
```

E o método principal:

```java
public static void main(String[] args) {
```

É dentro do `main` que todas as operações de fila e pilha são executadas.

---

# Implementação da Fila

A fila é criada através de:

```java
Queue<String> filaBanco = new ArrayDeque<>();
```

Aqui:

* `Queue<String>` indica que a fila armazenará objetos do tipo `String`;
* `ArrayDeque<>` fornece a implementação da estrutura.

---

## Inserindo elementos

São adicionadas três pessoas:

```java
filaBanco.offer("Ana");
filaBanco.offer("Bruno");
filaBanco.offer("Carla");
```

A fila fica:

```text
INÍCIO
  ↓
Ana → Bruno → Carla
                ↑
               FIM
```

A ordem de inserção é:

```text
1. Ana
2. Bruno
3. Carla
```

---

## Removendo da fila

O programa utiliza:

```java
String pessoaAtendida = filaBanco.poll();
```

O método `poll()` remove e retorna o primeiro elemento da fila.

Nesse caso:

```text
Ana
```

é removida.

A fila passa a ser:

```text
Bruno → Carla
```

O nome da pessoa atendida é armazenado na variável:

```java
pessoaAtendida
```

---

## Exibindo o resultado

O programa imprime:

```java
System.out.println("Saiu da fila do banco: " + pessoaAtendida);
System.out.println("Fila restante: " + filaBanco);
```

A saída esperada é:

```text
Saiu da fila do banco: Ana
Fila restante: [Bruno, Carla]
```

A representação da fila mostra que `Ana` foi removida e `Bruno` e `Carla` continuam aguardando.

---

# Implementação da Pilha

A pilha é criada com:

```java
ArrayDeque<Integer> pilha = new ArrayDeque<>();
```

Nesse caso:

```text
ArrayDeque<Integer>
```

significa que a estrutura armazenará valores inteiros (`Integer`).

---

## Inserindo elementos na pilha

São adicionados:

```java
pilha.push(10);
pilha.push(20);
pilha.push(30);
```

O método `push()` adiciona o elemento no topo da pilha.

Depois das três inserções:

```text
        TOPO
         ↓
        30
        20
        10
```

A ordem de entrada foi:

```text
10 → 20 → 30
```

Porém, como se trata de uma pilha, o elemento mais recente fica no topo.

---

## Removendo da pilha

O programa utiliza:

```java
Integer numeroRemovido = pilha.pop();
```

O método `pop()` remove e retorna o elemento que está no topo.

Portanto, o valor removido será:

```text
30
```

Depois da remoção:

```text
        TOPO
         ↓
        20
        10
```

---

## Exibindo o resultado

O programa imprime:

```java
System.out.println("Saiu da pilha: " + numeroRemovido);
System.out.println("Pilha restante: " + pilha);
```

A saída esperada é:

```text
Saiu da pilha: 30
Pilha restante: [20, 10]
```

---

# Diferença entre Fila e Pilha

O exercício permite visualizar claramente a diferença entre as duas estruturas.

| Estrutura | Princípio | Inserção | Remoção |
| --------- | --------- | -------- | ------- |
| Fila      | FIFO      | Final    | Início  |
| Pilha     | LIFO      | Topo     | Topo    |

### Fila

```text
Ana → Bruno → Carla

Sai:
Ana
```

### Pilha

```text
30
20
10

Sai:
30
```

---

# Métodos utilizados

## Fila

### `offer()`

```java
filaBanco.offer("Ana");
```

Adiciona um elemento ao final da fila.

### `poll()`

```java
filaBanco.poll();
```

Remove e retorna o primeiro elemento da fila.

Caso a fila esteja vazia, `poll()` retorna `null`.

---

## Pilha

### `push()`

```java
pilha.push(10);
```

Adiciona um elemento ao topo da pilha.

### `pop()`

```java
pilha.pop();
```

Remove e retorna o elemento que está no topo.

---

# Fluxo do programa

```text
                    INÍCIO
                       │
                       ▼
              Cria fila do banco
                       │
                       ▼
             Insere Ana, Bruno
                 e Carla
                       │
                       ▼
             Remove o primeiro
                 elemento
                       │
                       ▼
              Exibe a fila
                       │
                       ▼
               Cria a pilha
                       │
                       ▼
             Insere 10, 20 e 30
                       │
                       ▼
              Remove o elemento
                  do topo
                       │
                       ▼
              Exibe a pilha
                       │
                       ▼
                      FIM
```

---

# Saída esperada

Ao executar o programa, a saída será:

```text
Saiu da fila do banco: Ana
Fila restante: [Bruno, Carla]
Saiu da pilha: 30
Pilha restante: [20, 10]
```

---

# Conceitos praticados

Este exercício permite praticar:

* Java;
* Programação Orientada a Objetos;
* Estruturas de dados;
* Filas;
* Pilhas;
* Interface `Queue`;
* Classe `ArrayDeque`;
* Princípio FIFO;
* Princípio LIFO;
* Inserção e remoção de elementos;
* Tipos genéricos (`Queue<String>` e `ArrayDeque<Integer>`).

---

# Tecnologias

* **Java**
* **ArrayDeque**
* **Queue**
* **JDK**

---

# Conclusão

O exercício demonstra a utilização de estruturas de dados fundamentais em Java através da classe `ArrayDeque`.

Na primeira parte, `ArrayDeque` é utilizada por meio da interface `Queue` para representar uma **fila de banco**, onde `Ana`, sendo a primeira pessoa inserida, é a primeira a ser atendida. Isso representa o princípio **FIFO — First In, First Out**.

Na segunda parte, `ArrayDeque` é utilizada como uma **pilha**, onde os valores `10`, `20` e `30` são inseridos com `push()`. Como `30` foi o último elemento inserido, ele é o primeiro a ser removido através de `pop()`, demonstrando o princípio **LIFO — Last In, First Out**.

O exercício, portanto, apresenta de forma simples e prática a diferença entre o funcionamento de **filas e pilhas em Java**.
