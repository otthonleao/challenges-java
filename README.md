# Challenges Java
Repositório com desafios propostos para o aprendizado com a linguagem Java.

## What are there here?
- [Digital Bank](https://github.com/otthonleao/challenges-java/tree/main/DIO/Digital%20Bank) : Desafio proposto pela [DIO](https://web.dio.me/track/formacao-java-developer) para praticar os pilares da Programação Orientada à Objetos (POO) em Java, como abstração, encapsulamento, herança e polimorfismo, criando um banco digital e explorando os principais contextos de um sistema bancário, tais como saque, depósito, transferência e extrato.

## My bookmarks about Java
#### Principais Características
* É uma linguagem de programação orientada à objetos.
* Tudo em Java são Classes e Objetos.
* É independente de plataforma, pois seus programas são compilados em um arquivo *bytecode* que são interpretados e executados pela Java Virtual Machine (JVM).
> Todo Código Fonte é um arquivo `.java` e todo código que a máquina irá interpretar pela JVM é um arquivo `.class`.
* É uma linguagem concorrente com aplicações multithread.

#### Scanner
A leitura no terminal e o armazenamento dentro da variável é feita de acordo com o tipo primitivo adequado usando o método `next<Tipo Primitivo>()`
```java
import java.util.Scanner

Scanner scan = new Scanner(System.in);
System.out.print("Digite um número inteiro");
int valorInt = scan.nextInt();

scan.nextLine(); //Limpeza da entrada após a leitura de números

System.out.print("Digite o seu nome");
String nome = scan.nextLine();

scan.close();
```
#### Array
É uma lista ordenada de dados. As posições são indicadas por index que começa em 0.
```java
public class App {
	public static void main(String[] args){
		int entregas[] = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: laço de repetição que verifique APENAS seus números Pares:
		for (int i = 0; i < entregas.length; i++){
			if (entregas[i] % 2 == 0){ System.out.println(entregas[i]); } 
    }
  }
}
```

