# Atividade 3 – App Lista de Tarefas

## Descrição
Este projeto consiste no desenvolvimento de um aplicativo de Lista de Tarefas em Java, executado via terminal, que permite ao usuário gerenciar tarefas de forma simples e organizada.

O sistema possibilita:
- Adicionar tarefas
- Listar tarefas
- Remover tarefas
- Alterar o status das tarefas

Os status disponíveis são:
- DISPONIVEL
- FAZENDO
- FEITA

---

## Funcionalidades Implementadas

### 1. Adicionar Tarefa
O usuário pode cadastrar uma tarefa informando:
- Nome
- Descrição  
O status inicial da tarefa é definido como DISPONIVEL.

### 2. Listar Tarefas
Exibe todas as tarefas cadastradas, mostrando:
- Índice
- Nome
- Descrição
- Status

### 3. Remover Tarefa
O usuário seleciona uma tarefa pelo índice para removê-la da listaTarefas.

### 4. Alterar Status da Tarefa
O usuário escolhe uma tarefa e define um novo status:
- DISPONIVEL
- FAZENDO
- FEITA

---

## Padrões de Projeto Utilizados

### 🔹 Singleton
**Classe:** `ListaTarefas`

**Objetivo:**  
Garantir que exista apenas uma única instância da lista de tarefas durante toda a execução do programa.

**Funcionamento:**  
Classe possui:
- Construtor privado
- Método estático `getInstancia()` que controla a criação da instância

Evitando múltiplas listas e centralizando o gerenciamento das tarefas.

---

### 🔹 Strategy
**Classes envolvidas:**
- `AlterarStatusStrategy`
- `StatusDisponivel`
- `StatusFazendo`
- `StatusFeita`

**Objetivo:**  
Encapsular a lógica de alteração do status das tarefas, permitindo maleabilidade e fácil manutenção.

**Funcionamento:**  
Cada status possui uma estratégia própria que implementa a interface `AlterarStatusStrategy`.  
A classe `ListaTarefas` utiliza a estratégia escolhida para alterar o status da tarefa.

---

## Estrutura do Projeto

- `Status`: enum com os estados da tarefa
- `Tarefa`: representa uma tarefa
- `ListaTarefas`: gerencia as tarefas (Singleton)
- `AlterarStatusStrategy`: interface do padrão Strategy
- Classes de status: estratégias concretas
- `ListaTarefas`: classe principal com menu interativo

/src
 ├── Status.java
 ├── Tarefa.java
 ├── AlterarStatusStrategy.java
 ├── StatusDisponivel.java
 ├── StatusFazendo.java
 ├── StatusFeita.java
 ├── ListaTarefas.java
 └── Main.java
