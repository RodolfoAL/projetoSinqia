package Modulo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio02Class {
    public static void main(String[] args) {
        /*
        Crie um programa que receba nomes e preços de produtos e depois no final mostre qual o produto mais caro e o mais barato.
        Entradas:
            Nome e preço do produto
            Finalizar operação
        Saida:
            Nome e preço do produto mais caro
            Nome e preço do produto mais barato
         */
        Scanner entrance = new Scanner(System.in);
        String product, registration;

        List<String> listOfProducts = new ArrayList<>();
        List<Double> listOfPrices = new ArrayList<>();
        List<Double> listOfPrices02 = new ArrayList<>();

        do {
            System.out.println("Digite um produto: ");
            product = entrance.next();
            listOfProducts.add(product);
            System.out.println("Digite seu preço: ");
            double preco = entrance.nextDouble();
            listOfPrices.add(preco);
            listOfPrices02.add(preco);
            System.out.println("Quer entrar com mais um produto? sim ou nao? ");
            registration = entrance.next();
        } while (registration.equals("sim"));

        Collections.sort(listOfPrices02);

        double lowestPrice = listOfPrices02.get(0);
        double biggestPrice = listOfPrices02.get(listOfPrices.size() - 1);

        System.out.println("O produto mais caro é: " + listOfProducts.get(listOfPrices.indexOf(biggestPrice)) + " e seu preço é: R$" + biggestPrice);
        System.out.println("O produto mais barato é: " + listOfProducts.get(listOfPrices.indexOf(lowestPrice)) + " e seu preço é: R$" + lowestPrice);
        entrance.close();
    }
}
