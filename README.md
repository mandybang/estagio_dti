# estagio_dti
#   PetFácil
Repositório do desafio da DTI - Estagio de desenvolvedor de Software
Descrição breve:
O código solicitado no desafio da DTI é um aplicativo que compara três petshop sobre seu valor e distancia para facilitar a vida de Eduardo, dono de um Canil, para levar seus animais para um banho e tosa..

### Pré-Requisitos

- [JAVA] versão 21.0.2
- [IDE] Visual Studio

### Passos para Configuração e Execução

1. **Clone o repositório:**

   ``` git clone https://github.com/mandybang/estagio_dti.git
   ```

2. **Acesse o sistema:**
    Vá no Visual Studio, acesse o repositório clonado em seu computador e rode o código para gerar a interface.

## Lista de Premissas Assumidas

- **Ambiente de Desenvolvimento:** O código de Java desenvolvidos na IDE Visual Studio.
- **Acesso à Internet:** É necessário para clonar o repositório, após isso não há necessidade de acesso a internet.

## Decisões de Projeto
  **Escolha da linguagem:** Foi escolhido JAVA pela familiaridade que possuo pela linguagem, já que estou estudando ela atualmente na faculdade em que estou cursando e pela facilidade de acesso a informações voltadas a essa ferramenta. 

  **Analise do projeto:**
1- Cálculo do custo em cada petshop:
Meu Canino Feliz: Preços variam entre dias úteis e finais de semana. (20%)
Vai Rex: Preços variam entre dias úteis e finais de semana. (Finais de semana aumentam 5 reais)
ChowChawgas: Preços fixos todos os dias.

2- Identificar qual é o dia da semana:
Conforme informado acima dependendo do Petshop o valor muda conforme a semana passa.

3 - Identificar a distancia:
Caso ocorra um empate no valor dos petshop, o pet shop mais proximo será o escolhido.
Canino Feliz: 2km de distancia
Vai Rex: 1,7km
ChowChawgas: 800m

## Informações Adicionais
- **Referencias:**
- [Mdn Web Docs](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay)
- [Alura](https://www.alura.com.br/artigos/como-converter-string-para-date-em-java )
- [DevMedia](https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401)
- [DevMedia](https://www.devmedia.com.br/java-interface-aprenda-a-usar-corretamente/28798)
- [Java Progressivo](https://www.javaprogressivo.net/2012/11/JFrame-e-JPanelDesenhando-em-Java.html)
- [DevMedia ](https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981)
- [W3School](https://www.w3schools.com/java/default.asp)
- [Docs Oracle](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoField.html)


- **Maiores dificuldades no código:**
Criar a interface, pois ainda não utilizei do desenvolvimento da interface do Java, mas foi a unica forma que consegui pensar em como realizar a entrega do projeto, a parte de data, por utilizar muitas bibliotecas voltadas ao resultado que eu desejava, criações do POO e dúvidas sobre como realizar alguns calculos do final de semana. 

- **Melhorias futuras:**
 * Frontend, poderia melhorar a interface utilizando uma linguagem mais voltada a interface gráfica, como React ou Typescript
 * Integrar ao banco de dados, para escalonamento do projeto, utilizando python para as analises e SQL para criação do banco.
 * Mudar de linguagem, para abrir novas possibilidades de resoluções.
 * Fazer o projeto em versão mobile, pois a maioria das pessoas atualmente utilizam aplicativos no celular do que no computador.

- **Contato:**
  - Para dúvidas ou suporte, entre em contato pelo e-mail: [amandafj.50@gmail.com] ou crie uma issue no repositório.

---
