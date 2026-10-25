# Builder Pattern — Exercício em Java

Exercício acadêmico de **programação orientada a objetos e padrões de projeto**, usando o domínio de construção de casas para estudar o padrão *Builder*.

## Código existente

As classes de `src/main/java/org/example/` incluem:

- `IBuilderCasa.java`: contrato relacionado à construção.
- `Casa.java`: representação principal do domínio.
- `Casa2Quartos.java` e `Casa2Quartos2BanheiroChurrasqueira.java`: configurações de casas usadas no exemplo.
- `PatternsBuildApplication.java`: ponto de entrada da aplicação.

## Executar

O projeto contém `pom.xml` e pode ser aberto em uma IDE Java com suporte ao Maven.

```bash
git clone https://github.com/gusty22/DesignPatternBuilder-TrabalhoCrispim.git
cd DesignPatternBuilder-TrabalhoCrispim
mvn compile
```

Para executar, abra `PatternsBuildApplication` na IDE. O comando Maven acima apenas compila, não executa a classe.

## Propósito

Demonstrar a separação entre as etapas de criação de um objeto e as possíveis configurações resultantes. Trata-se de um exercício pontual, não de uma biblioteca de produção.
