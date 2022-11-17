package Modulo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio02Class2 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        String product, registration;

        List<String> listOfProducts = new ArrayList<>();
        List<Double> listOfPrices = new ArrayList<>();

        do {
            System.out.println("Digite um produto: ");
            product = entrance.next();
            listOfProducts.add(product);
            System.out.println("Digite seu preço: ");
            double price = entrance.nextDouble();
            listOfPrices.add(price);
            System.out.println("Quer entrar com mais um produto? sim ou nao? ");
            registration = entrance.next();
        } while (registration.equals("sim"));

        System.out.println("O produto mais caro é: " + listOfProducts.get(listOfPrices.indexOf(Collections.max(listOfPrices))) + " e seu preço é: R$ " + Collections.max(listOfPrices));
        System.out.println("O produto mais barato é: " + listOfProducts.get(listOfPrices.indexOf(Collections.min(listOfPrices))) + " e seu preço é: R$ " + Collections.min(listOfPrices));

        /* ou também poderia ter sido feito:

        double lowestPrice = Double.MAX_VALUE;
        double biggestPrice = Double.MIN_VALUE;

        for (int i = 0; i < listOfPrices.size(); i++) {
            if (listOfPrices.get(i) < lowestPrice) {
                lowestPrice = listOfPrices.get(i);
            }
        }

        for (int i = 0; i < listOfPrices.size(); i++) {
            if (listOfPrices.get(i) > biggestPrice) {
                biggestPrice = listOfPrices.get(i);
            }
        }

        double lowestPrice = Collections.min(listOfPrices);
        double biggestPrice = Collections.max(listOfPrices);

        System.out.println("O produto mais caro é: " + listOfProducts.get(listOfPrices.indexOf(biggestPrice)) + " e seu preço é: R$" + biggestPrice);
        System.out.println("O produto mais barato é: " + listOfProducts.get(listOfPrices.indexOf(lowestPrice)) + " e seu preço é: R$" + lowestPrice);
        */

        entrance.close();
    }
}
