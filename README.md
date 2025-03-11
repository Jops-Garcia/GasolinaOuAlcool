# Gasolina ou Álcool? 🚗

Este é um aplicativo Android que ajuda os usuários a decidir a melhor opção para abastecer seus veículos, calculando se é mais econômico usar gasolina ou álcool com base nos preços fornecidos.

## 📋 Funcionalidades

- **Entrada de preços:** O usuário insere os preços do álcool e da gasolina.
- **Cálculo:** O aplicativo determina qual combustível é mais vantajoso, utilizando a regra dos 70% (se o preço do álcool for inferior a 70% do preço da gasolina, o álcool é a melhor escolha).
- **Feedback claro:** Uma mensagem indica qual é a melhor opção para abastecimento.


## 🚀 Tecnologias Utilizadas

- **Linguagem:** Kotlin
- **Interface:** Android ConstraintLayout e Material Design


## 🛠️ Estrutura do Código

### Arquivos principais:

1. **`activity_main.xml`**
   - Define a interface gráfica com:
     - Campos de entrada para os preços do álcool e da gasolina.
     - Um botão para calcular o resultado.
     - Uma exibição do resultado final.

2. **`MainActivity.kt`**
   - Controla o comportamento do aplicativo:
     - Inicializa os componentes da interface.
     - Valida os campos de entrada.
     - Realiza o cálculo e exibe o resultado.


## 📖 Como Usar

1. Insira o preço do álcool no primeiro campo.
2. Insira o preço da gasolina no segundo campo.
3. Clique no botão **"Calcular"**.
4. Veja o resultado exibido na tela indicando o combustível mais vantajoso.


## ✨ Exemplo de Interface

A interface inclui:
- Um campo para o preço do álcool.
- Um campo para o preço da gasolina.
- Um botão para iniciar o cálculo.
- Um espaço para exibir o resultado.
![image](https://github.com/user-attachments/assets/c078ad7f-76fb-4258-b8c2-a14e1b500d59)


