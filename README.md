# 🎯Introdução ao Java📝
![Tux e Java](https://api.devicons.dev.br/icon?icons=Linux%2CJava%2CVSCode%2CIdea&size=48&theme=light&perline=30)
#
### Orientação: 
Neste repo estou documentando a construção do meu conhecimento em programação com Java, com base em alguns cursos e pesquisas complementares.
#
#
## Desenvolvimento Java
Aqui, temos **artigos** e **códigos fonte** a cerca de temas que estou fascinadamente aprendendo em Java. A referência do documento a seguir é o Curso de Desenvolvimento Java, da Arquiteta de Soluções Giuliana Silva Bezerra e pesquisas complementares. 
 
### Documentação:
**Artigo 01**: [Java — Introdução](https://medium.com/@atom.free/java-introdu%C3%A7%C3%A3o-3292761e18e8?postPublishedType=repub)

Conteúdo:

   - **Fundamentos**: Código Binário e Linguagem de Baixo Nível.
   - **Arquitetura**: Interpretador vs Compilador e o lema do Java (**WORA**).
   - **Ambiente**: O papel da **JDK, JRE e JVM**, além das principais IDEs.
   - **Setup Linux**: Instalação em OS baseada em Ubuntu e extensões essenciais.
   - **Projeto e Estrutura**: Como criar um projeto, organização de diretórios e pacotes.
   - **Mão na Massa**: Estrutura de um programa, **comandos nativos** (**javac, java, java**p), Método encapsulamento.Main e **Entry Point**.
   - **Saída de Dados**: O comando println e gerenciamento de arquivos.

     - **Código 01**: [encapsulamento.Main.java](https://github.com/SamuraiQAction87/curso-desenvolvimento-java/blob/main/estrutura-programa-java/src/olamundo/Main.java)


#
#
**Artigo 02:** [JAVA: A importância da precisão nos dados](https://medium.com/@atom.free/java-02-f31f913b46c9?postPublishedType=repub)

Conteúdo:

 - **Tipos Primitivos**: Entender o “tamanho” de cada **recipiente de dado** (**byte, int, long, float, double**). 

 - **Casting de Tipos** (A arte da conversão):

 - **Widening (Implícito)**: Quando o Java promove um tipo menor para um maior sem riscos. É o “cabe com folga”.
 - **Narrowing (Explícito)**: Aqui entra a responsabilidade do desenvolvedor. Para “espremer” um dado maior em um menor, o Java exige o casting manual. Como QA, aprendi que aqui mora o perigo da perda de precisão (truncamento)!
   
 - O desafio da **Divisão de Inteiros**: Um dos maiores aprendizados foi entender por que 9 / 2 resulta em 4.0 e não 4.5, mesmo salvando em um float. A ordem dos fatores e o momento do casting mudam tudo. Para um QA que trabalha com cálculos financeiros ou automação de performance, esse detalhe é a diferença entre um teste aprovado e um erro de cálculo crítico.

     - **Código 02**: [TiposPrimitivos.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura-programa-java/src/tiposprimitivos/TiposPrimitivosNotasEstudos.java)
     
     - **Código 03**: [Variáveis.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura-programa-java/src/variaveis/VariaveisNotasEstudo.java)
     
     - **Código 04**: [Casting.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura-programa-java/src/casting/CastingNotasEstudos.java)

     
#
#
**Artigo 03:** [JAVA — Entrada e Saída de dados](https://medium.com/@atom.free/java-entrada-e-sa%C3%ADda-de-dados-cf46ff7f7479?postPublishedType=repub)

Conteúdo:

   - Classe Scanner, seu import, o argumento [Sytem.in] e o encerramento do recurso com [**scanner.close()**].
   - Métodos de captura [**nextInt(…)**], [**nextLine(…)**] e [**next(…)**].
   - Método [**printf(…)**] e os **especificadores de formato**.
   - O Tipo de Dado de referência [**String**].
   - [**String Pool**] que é a forma inteligente que o Java lida com duas variáveis string com o mesmo conteúdo.
   
     - **Código 05**: [IoNotasEstudos.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/io/IoNotasEstudos.java)
       
     - **Código 06**: [StringNotasEstudo.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/string/StringNotasEstudo.java)



#
## Hands-on:
    
   - **Código 07**: [**Média Aritmética**](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/media/MediaAritmetica.java)
      - **Função**: Programa que captura 3 notas digitadas pelo usuário, **efetua a soma**, depois **calcula a média aritmética e a imprime.
#

   - **Código 08**: [**Conversão de Anos em Dias**](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/idade/DiasDeIdade.java)
      - **Função**: Captura a **idade do usuário digitada em anos**, depois **converte para dias** e imprime.
#

   - **Código 09**: [**Tabuada**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/tabuada/Tabuada.java)
      - **Função**: **Capturar o input numérico inteiro** que o usuário digitar, **tendo como output** a **tabuado até o 10** do número digitado. 
#

   - **Código 10**: [**Operadores Relacionais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/oprelacional/RelacionamentosDeOrdem.java)
     - **Função**: Este programa permite que o usuário faça o **input de 2 números inteiro**,para que eles sejam **comparados pelos operadores lógicos relacionais**.
#

   - **Código 11**: [**Programa Cálculo de Desconto**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/desconto/PrecoComDesconto.java)
     - **Função**:  Este programa **lê o valor do produto** e o **desconto em porcentagem**, ambos imputados pelo usuário. Depois, calcula o valor do desconto na compra à vista  do produto, **informando o valor com desconto e o valor economizado**.
#

   - **Código 12**: [**Cálculo de estoque médio**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estoque/EstoqueMedio.java)
     - **Função**: Programa que **calcula o estoque médio** de um produto, com base no estoque mínimo e no máximo.
#

   - **Código 13**: [**Conversor de Dólares em Reais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/conversor/ConverosrDolarReal.java)
     - **Função**: Este programa **converte valores de Dólares para Reais**.
#

  - **Código 14**: [**Saudação ao Usuário**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/console/SaudacaoConsole.java)
     - **Função**: Usando a classe Console ao invés da Scanner, o programa lê o nome do usuário, informado em um input, depois, concatena isso com uma saudação, imprimindo na tela.
#
#
## IF-ELSE / IF ternário / SWICH-CASE / WHILE & FOR:

  - **Código 15**: [**IF: Checador de Idade**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/ChecadorDeIdade.java)
     - **Função**: Entrando em **Estruturas de Decisão**, esse é o 1º código, no qual uso a **estrutura if** para **verificar se o usuário tem 18 anos ou mais**, para que possa conseguir comprar um ingresso para um evento. Também usaremos o **If Ternário**.
#

  - **Código 16**: [**Switch-Case: Checador de Notas**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estrutura_switch/ChecadorDeNotas.java)
     - **Função**: Esta é outra possibilidade de **Estrutura de Decisão**. Porém, o **Switch** trabalha com a ideia de **avaliar o valor de uma variável**, **não uma expressão booleano**. Este programa verificará a nota que o usuário digitar e, de acordo com a nota, terá um output com feedback específico. 
#

  - **Código 17**: [**If-Else: Checador de Aprovados**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AprovadoReprovado.java)
     - **Função**: Através da estrutura **If-Else** e com base em parâmetro definido, o programa em questão é capaz de fazer a média aritmética e informar se, de acordo com o parâmetro definido, o aluno foi aprovado ou não. 
#

  - **Código 18**: [**If-Else: Par ou Impar?**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/ParOuImpar.java)
     - **Função**: Ainda usando da estrutura **If-Else**, agora com o **operador de módulo (%)** - que verifica o **resto da divisão** -, este programa verifica se um input inteiro feito pelo usuário é **par ou impar**.
#

  - **Código 19**: [**If-Else: Ordem Crescente**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/OrdemCrescente.java)
     - **Função**: Programa lê 3 números e os imprime em ordem crescente.
#

  - **Código 20**: [**Switch-Case: Calculator**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/Calculator.java)
     - **Função**: Programa lê 2 números e o operador informado pelo usuário, para efetuar o cálculo conforme operação solicitada.
#

  - **Código 21**: [**If-Else: Calculator de IMC**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/CalculadoraIMC.java)
     - **Função**: Programa lê 2 valores: Peso e Altura, calcula o IMC e informa o resultant e a classificação em que o usuário se encontra.
#

  - **Código 22**: [**Switch-Case: Calcula Área de Figura Geométrica**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AreaFiguraGeometrica.java)
     - **Função**: Permite que o usuário informe o tipo de figura geométrica e os parâmetros a serem calculados, para que possa informar à área.
#

  - **Código 23**: [**If-Else: Verificador de Ano Bissexto**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AnoBissexto.java)
     - **Função**: Verifica se um ano é bissexto ou não.
#

  - **Código 24**: [**While-If-Else: Adivinhe o número**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/WhileStructure.java)
     - **Função**: Aqui, temos um jogo que dá 5 chances para que o usuário tente acertar um determinado número. Por isso, este será o 1º código usando a **estrutura de repetição** **'while'** com um **If-Else aninhado** nele.
#

  - **Código 25**: [**For: Cálculo de Fatorial**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/ForStructure.java)
     - **Função**: Calcula **fatorial** com a estrutura de repetição '**for**'.
#

  - **Código 26**: [**Jump Statement/continue: Contador de números pares**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/JumpStatements.java)
     - **Função**: Programa que conta de 1 até 50, **imprimindo** apenas **os pares, passando um  Jump Statement 'continue' para pular os ímpares**.
#
#
## JUMP STATEMANT = BREAK / RETURN:

  - **Código 27**: [**Jump Statement/break: Parada por comando específico**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/JumpStatementsII.java)
     - **Função**: Exemplo de uso do Jump Statement "**break**" para **encerrar um loop quando o usuário digitar uma opção específica** (**0** neste caso).
#

  - **Código 28**: [**Jump Statement/return: Parada por comando específico**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/JumpStatementsIII.java)
     - **Função**: Exemplo de uso do Jump Statement "**return**" para **encerrar um loop quando o usuário digitar uma opção específica** (**0** neste caso).
#
#
## ARRAYS / ARRAYS MULTIDIMENSIONAIS = Propriedade LENGTH / FOR & FOREACH:
  - **Código 29**: [**Arrays/for/for-each/String[] args: passando argumento em tempo de execução**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/arrays-java/arrays-java/src/ArrayStructure.java)
     - **Função**: Dando **introdução ao array**, neste programa foi usado um array de **tipo de referência** com a **classe String** com frutas. Depois, acessamos e modificamos um elemento do Array. 

Em seguida, verificamos o tamanho do Array com a **propriedade 'length'** da classe String com um l**oop 'for'** para fazer a iteração, percorrer o Array, imprimindo todos elementos. Depois, iteramos sobre o array com um **loop 'for-each'**, deixando o código muito mais legível. 

Por fim, comentei o código, da parte onde acessei e modifiquei os elementos até o fim, para usar a estrutura inicial para testar a passagem de argumento pelo terminal, em tempo de execução, usando a classe 'String' e seus argumentos, contida no método 'main com um **loop for-each**, logo após **instanciar o objeto frutas**. Então, pelo terminal, de dentro do diretório 'bin', podemos **executar o '.class', passando mais frutas**, **ex.:** [.../bin$ **java ArrayStructure "Jaca" "Cajú"**].
#

  - **Código 30**: [**Array/Array Multidimensional: Percorrendo com For aninhado**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/arrays-java/arrays-java/src/ArrayMultidimensional.java)
     - **Função**: Vimos como lidar com arrays simples. Agora, vamos ver como **criar arrays multidimensionais**, **acessar suas posições**, **atualizar** seus **valores**, **acessar** o seus **tamanhos** e **percorrer** sua estrutura **com loops for aninhado**.
#

  - **Código 31**: [**Array/Array Multidimensional: Percorrendo com Foreach aninhado**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/arrays-java/arrays-java/src/PercorrendoArrayMultidimensional.java)
     - **Função**: Agora, vamos **percorrer** a estrutura do **array multidimensional com loop aninhado Foreach**.
#

  - **Código 32**: [**Array: Imprimir Array de Numeros**](https://github.com/QActions87/Fundamentos_java/blob/main/src/ImprimirArrayNumeros.java)
     - **Função**: Estre programa efetua a **leitura do tamanho do array** que o usuario digitar, **riando um array** este dado, posteriormente **capturando os dados** informados - a quantidade informada no tamanho -, depois ****os imprime**.
#

  - **Código 33**: [**Array: Gerenciador de Tarefas**](https://github.com/QActions87/Fundamentos_java/blob/main/src/Tarefas.java)
     - **Função**: Esse programa funciona como um **Gerenciador de Tarefas via Terminal**. Ele utiliza um **ciclo de repetição para manter o software ativo** até que você decida fechá-lo, permitindo manipular uma **lista fixa de 10 posições**.
#

  - **Código 34**: [**Array: Comparando Arrays de Numeros**](https://github.com/QActions87/Fundamentos_java/blob/main/src/ComparandoArraysNumeros.java)
     - **Função**: Programa compara 2 arrays criados pelo user, retornando os numeros em comum entre ambos.
#
#
## PROGRAMAÇÃO ORIENTADA A OBJETOS:


**Artigo 03:** [JAVA — **Programação Orientada a Objetos-I**](https://medium.com/@atom.freedom/java-programa%C3%A7%C3%A3o-orientada-a-objetos-fb842783fdcb)

Conteúdo:

 - Diferença do fluxo com e sem OO;

 - Classes;

 - Atributos;

 - Métodos;

 - Construtores Padrão;

 - Parâmetro x Argumento;

 - Construtores com Parâmetros;

 - Valores Default dos Atributos com Tipos Primitivos;

 - Valores Default dos Atributos com Tipos de Referência;

 - Import de Pacotes;

 - Membros Públicos;

 - Tipos de Referência;

 - Variáveis Possuem Tipos;

 - Wrapper Classes.

     - **Código 35**: [ObjectOrientedProgramming.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/ObjectOrientedProgramming.java)
     
     - **Código 36**: [Casa.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/moradias/Casa.java)
     
     - **Código 37**: [Compra.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Compra.java)
       
     - **Código 38**: [Usuario.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Usuario.java)
     
     - **Código 39**: [Produto.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Produto.java)
       
     - **Código 40**: [encapsulamento.Main.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/empresa.Main.java)
  
#
#
**Artigo 04:** [JAVA — **Programação Orientada a Objetos-II**](https://medium.com/@atom.freedom/java-programa%C3%A7%C3%A3o-orientada-a-objetos-ii-f8268bbdd7c9)

Conteúdo:

 - Modificador Static;
 - Método Static;
 - Atributo Static;
 - Quando usar o Static e Modificador Final;
 - Nomenclatura Padrão para Constantes;
 - Resumo dos Modificadores e suas Funções;
 - A classe java.lang.Math;
 - Arrays São Objetos;
 - Arrays de Primitivos;
 - Classe Utilitária 'Arrays' e o Método Static 'toString';
 - Arrays de Objetos;
 - Método Especial toString();
 - Igualdade entre Objetos;
 - Implementação dos métodos equals() e hashCode();
 - Notação @Override;
 - Igualdade entre Arrays;
 - Classe Utilitária.

     - **Código 41**: [Matematica.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Matematica.java)
     
     - **Código 42**: [Main2.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Main2.java)
     
     - **Código 43**: [ArrayNotasEstudos.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/ArrayNotasEstudos.java)
   
     - **Código 44**: [Gato.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/Gato.java)
     
     - **Código 45**: [ArrayNotasEstudosII.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/ArrayNotasEstudosII.java)
     
     - **Código 46**: [ComparandoObjetos.java](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/working-with-objects/src/ComparandoObjetos.java)
   
#
#
## PILARES DA ORIENTADA A OBJETOS:


**Artigo 05:** [JAVA — Pilares da Orientação a Objetos: **Encapsulamento e Abstração.**](https://medium.com/@atom.freedom/java-pilares-da-orienta%C3%A7%C3%A3o-a-objetos-encapsulamento-e-abstra%C3%A7%C3%A3o-d554f831e48b)

Conteúdo:

 - Encapsulamento;
 - Os Três Pilares Técnicos do Encapsulamento em Java:
   -	I - Modificadores de Acesso Private;
   -	II - Métodos Getters e Setters;
 	 -	II - Validação e Segurança (Regra de negócio).
 - Conceito de Encapsulamento na Prática;
 - Modificadores de Acesso em Atributos;
 - Modificadores de Acesso em Métodos;
 - Getters e Setters;
 - Mas, por que não deixar a variável pública de uma vez?
 - Modificadores de Acesso em Classes;
 - Modificadores de Acesso em Pacote Default;
 - Encapsulamento no Construtor;
 - Teoria: Abstração;
 - A Abstração com o exemplo da TV;
 - Prática: Abstração.
   

Loading...










