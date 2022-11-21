package Modulo01Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RedeSocial {
    public static Scanner entrance = new Scanner(System.in);
    //public static User[] persona = new User[100];
    public static List<User> users = new ArrayList<User>();
    public static int i = 0, count = 1;
    public static String menu;
    public static boolean verify = true;

    public static void main(String[] args) {

        inicialMenu();
        if (Objects.equals(menu, "c")) {
            System.out.println("Cadastrar usuário");
            //registerUserArray();
            registerUser();
        }else if (Objects.equals(menu, "e")) {
            System.out.println("entrar no programa");
        } else if (Objects.equals(menu, "f")) {
            System.out.println("Você saiu do programa. Foi um prazer, volte sempre que quiser!");
        }
        System.out.println(menu);

       /* for (i = 0; i < 1; i++) {
            System.out.println(persona[i].login);
        }*/
        for (i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).name);
        }


    }

    /**
     * Método responsável pelo menu inicial da rede social
     *
     * @return menu
     */
    public static String inicialMenu() {
        do {
            System.out.println("Bemvindo ao Menu inicial: ");
            System.out.println("Digite C para cadastrar, E para entrar ou F para fechar: ");
            menu = entrance.nextLine().toLowerCase();
            switch (menu) {
                case "c":
                case "e":
                case "f":
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inválido");
            }
        } while (verify);
        return menu;
    }
    /*
        /**
         * Método responsável por coletar o usuário e enviar para Array
         */
    /* public static void registerUserArray() {
        User a1 = new User();
        persona[0] = a1;

        System.out.println("Digite seu login: ");
        a1.login = entrance.nextLine();
        System.out.println("Digite seu nome completo: ");
        a1.name = entrance.nextLine();
        System.out.println("Digite uma senha: ");
        a1.password = entrance.nextLine();

    } */

    /**
     * Método responsável por registrar login, nome e senha do usuário
     * e armazenar em uma lista.
     * (Array de Strings contendo login, nome e senha.)
     */
    public static void registerUser() {

        User u1 = new User();
        users.add(u1);

        System.out.println("Digite seu login: ");
        u1.login = entrance.nextLine();
        System.out.println("Por favor, digite seu nome completo: ");
        u1.name = entrance.nextLine();
        System.out.println("Digite uma senha: ");
        u1.password = entrance.nextLine();
        count++;

    }

    /**
     * Método em que o Usuário cadastrado entra no sistema.
     * @return Usuário cadastrado.
     */
    public static String getOnline(){
        String a = "s";
        System.out.println("Digite seu login: ");
        String userLogin = entrance.nextLine();
        System.out.println("Entre com sua senha: ");
        String userPassword = entrance.nextLine();

       for (i = 0; i < users.size(); i++) {
           count = 0;
           if (users.get(i).login == userLogin) {
               count = i;
               break;
           }
       }



        return a;
    }
}
