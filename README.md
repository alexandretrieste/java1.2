# Descrição do Projeto

Este projeto consiste em um sistema simples de gerenciamento de veículos, onde existem duas classes principais: `Passeio` e `Carga`, que herdam da classe `Veiculo`. Cada veículo possui atributos como marca, modelo, placa, velocidade máxima, entre outros.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- **Veiculo.java**: Classe abstrata que define as características básicas de um veículo.
- **Passeio.java**: Classe que representa um veículo de passeio.
- **Carga.java**: Classe que representa um veículo de carga.
- **Motor.java**: Classe que define as características de um motor.
- **Teste.java**: Classe com o método `main` para testar o sistema.

## Funcionalidades

O sistema permite criar instâncias de veículos de passeio e de carga, definindo suas características como marca, modelo, placa, etc. Além disso, é possível calcular a velocidade máxima de cada veículo.

## Instruções de Uso

Para utilizar o sistema, basta instanciar objetos das classes `Passeio` e `Carga`, atribuindo valores aos seus atributos e chamando o método `calcVel()` para calcular a velocidade máxima.

Exemplo de utilização:

```java
Passeio veiculoPasseio = new Passeio();
veiculoPasseio.setMarca("Ford");
veiculoPasseio.setModelo("Mustang");
veiculoPasseio.setPlaca("ABC-1234");
veiculoPasseio.setVelocMax(250);
veiculoPasseio.setQtdRodas(4);
veiculoPasseio.setCor("Vermelho");
veiculoPasseio.setQtdPassageiros(4);
veiculoPasseio.getMotor().setPotencia(460);
veiculoPasseio.getMotor().setQtdPist(8);

System.out.println("Velocidade Máxima do veículo de passeio: " + veiculoPasseio.calcVel());
```
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias ou correções.

## Licença

Este projeto está licenciado sob a [MIT License](https://choosealicense.com/licenses/mit/).

## Contato

Se você tiver alguma dúvida ou sugestão, entre em contato comigo no [GitHub](https://github.com/alexandretrieste).
