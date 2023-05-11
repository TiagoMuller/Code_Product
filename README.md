# Programa de produtos com polimorfismo em Java

Este programa em Java implementa um sistema de gerenciamento de produtos utilizando polimorfismo, permitindo a criação de três tipos de produtos diferentes: comum, usado e importado.

# Ferramentas utilizadas

Java

Eclipse IDE

Funcionamento

O programa utiliza a classe Scanner para obter informações do usuário, a classe SimpleDateFormat para formatar a data de entrada e as classes Product, ImportedProduct e UsedProduct para armazenar informações sobre cada produto.

O polimorfismo é utilizado através do método priceTag() implementado nas três classes de produtos, permitindo a criação de tags de preço para cada tipo de produto.

# Como utilizar

Para utilizar o programa, siga os seguintes passos:

Clone o repositório do programa em sua máquina.

Abra o projeto em sua IDE Java (como o Eclipse).

Execute o arquivo Program.java.

Insira o número de produtos a serem cadastrados.

Para cada produto, informe se ele é comum (c), usado (u) ou importado (i), além de seu nome e preço.

Se for um produto importado, informe a taxa de alfândega.

Se for um produto usado, informe a data de fabricação no formato DD/MM/YYYY.

Após inserir todas as informações, o programa imprimirá uma lista com as tags de preço de cada produto cadastrado.

# Observações

O programa utiliza o decorador @Override para indicar que o método priceTag() está sendo sobrescrito nas subclasses.

--------------------------

# Java Polymorphic Products Program

This Java program implements a product management system using polymorphism, allowing the creation of three different types of products: common, used, and imported.

# Tools Used

Java

Eclipse IDE

# Functioning

The program uses the Scanner class to obtain user information, the SimpleDateFormat class to format the input date, and the Product, ImportedProduct, and UsedProduct classes to store information about each product.

Polymorphism is used through the priceTag() method implemented in the three product classes, allowing the creation of price tags for each type of product.

# How to Use

To use the program, follow these steps:

Clone the program repository on your machine.

Open the project in your Java IDE (such as Eclipse).

Run the Program.java file.

Enter the number of products to be registered.

For each product, inform whether it is common (c), used (u), or imported (i), as well as its name and price.

If it is an imported product, inform the customs fee.

If it is a used product, inform the manufacture date in DD/MM/YYYY format.

After entering all the information, the program will print a list with the price tags of each registered product.

# Notes

The program uses the @Override decorator to indicate that the priceTag() method is being overridden in the subclasses.
