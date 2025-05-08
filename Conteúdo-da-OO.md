# Abstrações da POO

## Classe 
- Molde para objetos; representação genérica das propriedades e comportamentos de elementos de um conjunto.

| Nome da classe |
|----------------|
| Atributos      |
| Métodos        |

## Objeto
- Instância (ocorrência específica) de uma classe


# Pilares da POO

## Herança
- Mecanismo da OO que possibilita a um subtipo aproveitar propriedades (atributos, métodos e relacionamentos) definidas em um supertipo 
                                                                        
- Uma maneira de promover reúso porém e a pior das maneiras de reúso.

- Benefícios: protutividade
  


| Pessoa  |                            
|----------------|
| Nome, Telefone     |         
|  mudarTelefone()  |

↑  

| Aluno  |                            
|----------------|
| Matricula     |         
|                |
        

## Representação de herança em Java

 - Por meio da palavra reservada: Extends;

    <pre> public class Aluno extends Pessoa {... </pre>

   Em java não existe herança múltipla entre classes em Java


## Polimorfismo
- Permite que você trate objetos de subclasses como objetos da superclasse, facilitando o uso de **polimorfismo**.

```java
Animal a = new Cachorro();
a.emitirSom();  // Pode chamar o som específico do Cachorro
```
---


## Encapsulamento
Capacidade de um objeto restringir o acesso a determinadas propriedades.  
Em Java, é realizado por meio de modificadores de visibilidade.

### Modificadores de visibilidade:
	- Capacidade de um objeto restringir o acesso a determinadas propriedades.
	- A visibilidade de uma propriedade interfere na herança? Sim.
	- Implementado por meio dos modificadores de visibilidade:
		- **private:** a propriedade pode ser acessada somente por 
		- public: a propriedade pode ser acessada por objetos de quaisquer classes do mesmo projeto.
		- "package": a propriedade pode ser acessada por objetos ...
		- protected: a propriedade pode ser acessada por objetos ...

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

A arquitetura **MVC** organiza o código da aplicação separando **responsabilidades**, **interesses**, **lógica de negócio** e **dados**.

### Componentes:

- **Model (Modelo):**
  - Representa as **entidades do domínio** da aplicação e suas regras de persistência.
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

