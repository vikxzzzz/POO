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

    
