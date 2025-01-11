# MegaSena App 🎰📱

## 📋 Descrição do Projeto

O MegaSena App é um aplicativo Android simples que permite ao usuário gerar números aleatórios para jogar na Mega-Sena. O usuário deve informar a quantidade de números que deseja gerar, podendo escolher entre 6 a 15 números. Após inserir o valor e clicar no botão "Gerar Números", o app utiliza a classe Random para sortear e exibir a quantidade de números solicitada.

Este projeto foi desenvolvido com o objetivo de praticar conceitos básicos de desenvolvimento Android, como:

- Criação de interfaces usando XML

- Manipulação de eventos em Kotlin

- Uso da classe Random para geração de números aleatórios

## 🛠️ Tecnologias Utilizadas

- Kotlin como linguagem principal

- Android Studio como ambiente de desenvolvimento

- A classe Random para gerar os números aleatórios

- XML para criação da interface gráfica

## 🖥️ Funcionalidades

- ✅ Entrada de texto para o usuário digitar a quantidade de números desejada (entre 6 e 15).
- ✅ Botão "Gerar Números" que aciona o sorteio.
- ✅ Geração de números aleatórios de 1 a 60, seguindo o padrão dos sorteios da Mega-Sena.
- ✅ Exibição dos números sorteados na tela.

## 📱 Tela do App

A interface do app é simples e intuitiva. O usuário verá uma tela inicial com:

- Um título "Boa Sorte!"

- Um campo de texto para inserir a quantidade de números desejada

- Um botão "Gerar Números"

Após o clique no botão, os números sorteados são exibidos na tela.

## 🎯 Como Funciona o Sorteio

O sorteio é feito usando a função Random do Kotlin, que gera números inteiros aleatórios dentro do intervalo de 1 a 60. A quantidade de números gerados depende do valor digitado pelo usuário.

- Exemplo:

   - Se o usuário digitar 6, o app irá sortear e exibir 6 números aleatórios.

   - Se o usuário digitar 10, o app irá sortear e exibir 10 números aleatórios.

## 🧩 Estrutura do Projeto

O projeto é composto por:

- MainActivity.kt: Arquivo principal da lógica do app.

- activity_main.xml: Arquivo responsável pelo layout da interface.

A lógica para a geração de números aleatórios está concentrada no arquivo MainActivity.kt, que utiliza a biblioteca Random para gerar os números de forma dinâmica.

## 🚀 Como Executar o Projeto

1 - Clone este repositório:

    git clone https://github.com/seu-usuario/megasena-app.git

2 - Abra o projeto no Android Studio.

3 - Conecte um dispositivo físico ou emulador.

4 - Execute o projeto clicando em Run (ou pressione Shift + F10).

## 📚 Aprendizados

- Com o desenvolvimento deste projeto, foi possível aprender:

   - Como criar uma interface simples usando XML.

   - Como manipular eventos de clique de botão em Kotlin.

   - Como usar a biblioteca Random para gerar números aleatórios.

   - Como validar entradas de usuário.
