### AudioSphere

## Visão Geral
Este projeto é uma aplicação Java que permite aos usuários classificar conteúdos de áudio, como músicas e podcasts. As classificações são validadas e armazenadas, e a média das classificações pode ser recuperada.

## Funcionalidades
- Classificar músicas e podcasts com avaliações.
- Validar avaliações para garantir que estejam dentro dos intervalos aceitáveis.
- Calcular e recuperar a média das classificações para o conteúdo de áudio.

## Estrutura do Projeto
- `org.mach.models`: Contém as classes modelo para conteúdo de áudio (`Audio`, `Music`, `Podcast`).
- `org.mach.services`: Contém a classe de serviço `Classificacao` para manipular as classificações.

## Começando

### Pré-requisitos
- Java 8 ou superior
- Maven

### Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/sudoaptgetmach/audiosphere.git
    cd audiosphere
    ```

2. Construa o projeto usando Maven:
    ```sh
    mvn clean install
    ```

### Executando a Aplicação
Execute a classe `Main` para iniciar a aplicação:
```sh
mvn exec:java -Dexec.mainClass="org.mach.Main"
```

## Uso
- Crie instâncias de `Music` ou `Podcast`.
- Use a classe `Classificacao` para definir e obter classificações.

### Exemplo
```java
Podcast podcast = new Podcast();
Classificacao classificacao = new Classificacao();

podcast.setNome("Teste");
podcast.setDescricao("Lorem ipsum.");
podcast.setDuracao(500);

classificacao.setClassificacao(podcast, 3);
classificacao.setClassificacao(podcast, 1);
classificacao.setClassificacao(podcast, 99);
classificacao.setClassificacao(podcast, 1);

double media = classificacao.getClassificacao();
System.out.println("Média de classificação: " + media);
```

## Licença
Este projeto é licenciado sob a Licença MIT.
