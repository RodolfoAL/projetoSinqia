package Modulo01;
public class Aula03exercicio01 {
    public static void main(String[]args) {
        /*
        Dívida de R$10.000,00 e cresce a juros de 2,5% ao mês
        aplicação de R$1.500,00 com rendimento a 4% ao mês

        determinar em qntos meses serão necessários para pagar a dívida
        */

    int divida = 10000;
    int aplicacao = 1500;
    int mes = 0;

    while(divida >= aplicacao) {
        divida *= 1.025;
        aplicacao *= 1.04;
        mes++;
    }
        System.out.println("A quantidade de meses é de: " + mes);
    }
}
