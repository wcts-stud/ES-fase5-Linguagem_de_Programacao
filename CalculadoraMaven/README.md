## Calculadora com teste de cobertura

Teste de cobertura do projeto calculadora @a6d0a84, utilizando maven com plugin cobertura.

1. Foi criado um projeto maven e copiado os pacotes do projeto @a6d0a84 para o projeto maven.

2. Em "build path":

 - 2.1  foi alterar o "JRE System Library" para JSE 1.8
 - 2.2.  Adicionado library JUnit versão 4.
 
3. No arquivo pom.xml deve alterar a linha para executar o teste de cobertura corretamente:
      <artifactId>junit</artifactId>
      <version>4.8.2</version>