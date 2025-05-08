# POO

## Exercícios e teorias em JAVA  


### Abstração da OO  
- **Classe:** Molde para obejtos; Representação genérica das propriedades e comportamento de elementos de um conjunto.

- **Objeto:** Instância (ocorrencia especifica) de uma classe.

- **EX:** Enzo é um objeto dentro de classe de aluno.

- na ULM uma classe é representada em um retangulo com 3 compartimentos. 1 - Nome da classe, 2 - Atributos, 3 - Métodos

| UML        | Exemplo        |
|-----------------|----------------|
| **Nome da Classe** | Aluno         |
| **Atributos**     | - Matrícula<br>- Nome<br>- Curso |
| **Métodos**       | - TrocarDeCurso()<br>- MudarDeNome() |  


 O estado dos obejtos é definido nos atribustos da classe 

 
## Herança
- Mecanismo da OO que possibilita a um subtipo aproveitar propriedades definidas em um supertipo.

  Essas propriedades são: Métodos, Relacionamentos e Atributos  

- Uma maneira de promover reúso, porém é a pior maneira de promover reuso. Poís se vc for herdar de uma classe, você vai ter que herdar TUDO.  

## Hernaça em java
- Por meio da palavra reservada extends, uma subclasse pode herdar propriedades de uma superclasse.
  

![Relacionamento](https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/orientacaoobjetos/extends.png)  
UML: Generalização  
Java: Extends  


### Ex: 
```
public class Aluno  
    extends Pessoa {
    ...
}
```
- Em java não existe herança múltipla entre classes.

---

## 🧬 Vantagens da Herança (POO)
- aumento de produtividade

### 🔁 1. Reutilização de código

Você pode reutilizar código de uma **classe base (superclasse)** em **classes derivadas (subclasses)** sem precisar reescrever tudo.

> **Exemplo:** Se você tem uma classe `Animal` com o método `comer()`, todas as subclasses como `Cachorro`, `Gato`, etc., herdam esse comportamento.

---

### 🧱 2. Organização e estrutura

Ajuda a organizar o código de forma mais **hierárquica** e **modular**. Fica mais fácil entender a relação entre os componentes do sistema.

> **Exemplo:** `Veículo` → `Carro`, `Moto`, `Caminhão`

---

### 🔄 3. Facilidade de manutenção

Alterações feitas na superclasse afetam todas as subclasses, tornando o código mais fácil de manter e atualizar.

---

### 🧬 4. Polimorfismo

Permite que você trate objetos de subclasses como objetos da superclasse, facilitando o uso de **polimorfismo**.

```java
Animal a = new Cachorro();
a.emitirSom();  // Pode chamar o som específico do Cachorro
```
---

### 📦 5. Redução de redundância

Você evita repetir atributos e métodos comuns em várias classes, centralizando-os na superclasse.  

---

## Encapsulamento
Capacidade de um objeto restringir o acesso a determinadas propriedades.  
Em Java, é realizado por meio de modificadores de visibilidade.
Encapsulamento
- Capacidade de um objeto restringir o acesso a determinadas propriedades.
- A visibilidade de uma propriedade interfere na herança? Sim.
- Implementado por meio dos modificadores de visibilidade:

### Modificadores de visibilidade:
  - **private:** a propriedade pode ser acessada somente por objetos da mesma classse.
  - **public:** a propriedade pode ser acessada por objetos de quaisquer classes do mesmo projeto.
  - **"package":** a propriedade pode ser acessada por objetos de quaisquer classes do mesmo pacote.
  - **protected:** a propriedade pode ser acessada por objetos 

### Getters e Setters:
- Getters (obtém) e Setters (define) permitem acessar e modificar os atributos privados de uma classe.
- Getters retornam o valor do atributo, enquanto Setters definem o valor do atributo.

## 🔷 Monolito

- Um **monolito** é uma arquitetura de software onde todos os componentes da aplicação (interface, lógica de negócio e acesso a dados) estão agrupados em uma única base de código e executados como um único processo.
- Frequentemente, o monolito é implementado em uma **única classe ou projeto** que concentra todas as funcionalidades da aplicação.

### Problemas Comuns:
- **Baixa escalabilidade:** difícil isolar partes específicas para escalar independentemente.
- **Dificuldade de manutenção:** alterações em uma parte do sistema podem afetar outras partes inesperadamente.
- **Complexidade crescente:** à medida que o projeto cresce, torna-se mais difícil de entender, testar e evoluir.

> 💡 **Separação de responsabilidades (SoC)** é frequentemente desrespeitada em monolitos, já que diversas responsabilidades estão misturadas em um mesmo bloco de código. Isso gera forte **acoplamento** e baixa **coesão**.

---

## 🧱 Arquitetura MVC (Model-View-Controller)

A arquitetura **MVC** organiza o código da aplicação separando **interface**, **lógica de negócio** e **dados**.

### Componentes:

- **Model (Modelo):**
  - Representa os **dados** da aplicação e suas regras de persistência.
  - É responsável por interagir com o **banco de dados**.
  - _Exemplo: uma classe `Produto` que representa a tabela de produtos no banco._

- **View (Visão):**
  - Responsável pela **interface com o usuário**.
  - Pode ser gráfica (GUI), textual (CLI) ou web (HTML/CSS).
  - Mostra os dados do `Model` e envia interações do usuário para o `Controller`.

- **Controller (Controlador):**
  - Atua como **intermediário** entre a View e o Model.
  - Contém a **lógica de negócio**, processando requisições e definindo o que deve ser exibido ou armazenado.
  - _Exemplo: lógica de cálculo de desconto em uma compra._

### ✅ Vantagens do MVC

- **Baixo Acoplamento:**
  - Cada camada é **independente**, permitindo alterações sem grandes impactos nas outras partes.

- **Alta Coesão:**
  - Cada módulo tem uma responsabilidade bem definida.
  - O código é mais **organizado**, **modular** e **reutilizável**.

- **Facilidade de Testes:**
  - É possível testar lógica de negócio (Controller e Model) sem depender da interface (View).

- **Melhor Manutenção e Escalabilidade:**
  - Adicionar funcionalidades ou corrigir erros se torna mais simples e seguro.
