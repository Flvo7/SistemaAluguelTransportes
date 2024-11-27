# Sistema de Aluguel de Meios de Transporte Individuais

Este projeto foi desenvolvido como parte da atividade da disciplina **Programação Orientada a Objetos II**. O objetivo foi implementar um sistema de aluguel de meios de transporte utilizando o padrão de projeto **Abstract Factory**.

## Descrição

O sistema gerencia o aluguel de meios de transporte individuais, como bicicletas, patinetes, patins e skates. O projeto foi desenvolvido utilizando o padrão de projeto **Abstract Factory**, permitindo a criação de diferentes tipos de transporte, classificados de acordo com o tipo de propulsão:

- **Movidos a Bateria**: Patinetes elétricos, bicicletas elétricas.
- **Movidos pelo Esforço Humano**: Bicicletas convencionais, patins, skates.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Transport.java**: Interface que representa um meio de transporte genérico.
- **ElectricScooter.java**, **ElectricBike.java**: Classes concretas para transportes movidos a bateria.
- **Bicycle.java**, **RollerSkates.java**, **Skateboard.java**: Classes concretas para transportes movidos pelo esforço humano.
- **TransportFactory.java**: Fábrica abstrata para criação dos transportes.
- **ElectricTransportFactory.java**: Fábrica concreta para transportes elétricos.
- **HumanPoweredTransportFactory.java**: Fábrica concreta para transportes movidos pelo esforço humano.
- **Main.java**: Classe principal que demonstra o uso do sistema.
