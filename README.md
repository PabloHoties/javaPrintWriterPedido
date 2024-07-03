# javaPrintWriterPedido

Este é um projeto Java que exporta os dados da entidades "Pedido", "Cliente" e "Pagamento" em um arquivo TXT ou XML usando PrintWriter.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados (entre parênteses com asterisco estão as versões que utilizei, outras versões também podem funcionar.):

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (*17)

## Diagrama de Classes do projeto
![](https://github.com/PabloHoties/javaPrintWriterPedido/assets/33355184/91ae0de5-6c14-4659-8e6f-d8255a8a6a8e)

## Funcionamento
A interação do usuário com o projeto é através da classe JOptionPane, com o usuário digitando nas caixas de diálogo. Na classe ``Main.java`` é chamado o método "obterDados" de ``PedidoController.java``.

Esse método de controle possui algumas etapas:

1. Pegam dados digitados no JOptionPane pelo usuário e os armazenam em objetos de "Pedido", "Cliente" e "Pagamento".
2. É criado um objeto da classe abstrata ``PedidoRepositoryAbstract.java`` como sendo ``null``.
3. Um switch case coordenará a instânciação desse objeto para ``PedidoRepositoryAbstractTxt.java`` ou ``PedidoRepositoryAbstractXml.java`` usando um polimorfismo.

Na classe de repositório os dados do objeto de "Pedido" são exportados para TXT ou XML, os arquivos gerados ficam localizados no diretório raiz do projeto.