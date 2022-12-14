package codingtank;

public class Temperatura {
    public static void main(String[] args){
        double fator1;
        int fator2;
        double f;
        double c = 25D;
        fator1 = 9/5D;
        fator2 = 32;

        f = (c * fator1) + fator2;
        System.out.println("A temperatura em Fahrenheit é: " + f);

        c = 18D;
        f = (c * fator1) + fator2;
        System.out.println("A temperatura em Fahrenheit é: " + f);
    }}
