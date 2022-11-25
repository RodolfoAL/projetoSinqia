package Modulo01Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RedeSocial {
    public static Scanner entrance = new Scanner(System.in);

    public static List<User> users = new ArrayList<User>();

    public static int i = 1, count = 1, index, chosenUserMenu;
    public static String menu, dateNow, hourNow, newPost;
    public static boolean verify = true;

    public static void main(String[] args) {

        System.out.println("Seja bem vindo � nova Rede Social");

        do {
            inicialMenu();
            if (Objects.equals(menu, "c")) {
                System.out.println("Cadastrar usu�rio");
                registerUser();
                System.out.println("Usu�rio cadastrado com sucesso");
                System.out.println("Voc� retorna agora para o");
                verify = true;
            } else if (Objects.equals(menu, "e")) {
                System.out.println("entrar no programa");
                String[] condition = getOnline();
                System.out.println("[" + condition[0] + ", " + condition[1] + "]");
                index = Integer.parseInt(condition[1]);
                verify = true;
                do {
                    chosenUserMenu = userMenu(index, condition);
                    switch (chosenUserMenu) {
                        case 1:
                            makePost(index);
                            verify = true;
                            break;
                        case 2:
                            viewTimeline(index);
                            verify = true;
                            break;
                        case 3:
                            verify = false;
                            break;
                    }
                } while (verify);
            } else if (Objects.equals(menu, "f")) {
                System.out.println("Voc� saiu do programa. Foi um prazer, volte sempre que quiser!");
                verify = false;
            }
        } while (verify);

        /* for (i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).name);
        } */

        entrance.close();
    }

    /**
     * M�todo respons�vel pelo menu inicial da rede social
     *
     * @return menu
     */
    public static String inicialMenu() {
        do {
            System.out.println("Menu inicial: O que deseja fazer?");
            System.out.println("Digite C para cadastrar, E para entrar ou F para fechar: ");
            menu = entrance.nextLine().toLowerCase();
            switch (menu) {
                case "c":
                case "e":
                case "f":
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inv�lido");
            }
        } while (verify);
        return menu;
    }

    /**
     * M�todo respons�vel por registrar login, nome e senha do usu�rio
     * e armazenar em uma lista.
     * (Array de Strings contendo login, nome e senha.)
     */
    public static void registerUser() {
        User userRegister = new User();
        users.add(userRegister);

        System.out.println("Digite seu login: ");
        userRegister.login = entrance.nextLine();
        System.out.println("Por favor, digite seu nome completo: ");
        userRegister.name = entrance.nextLine();
        System.out.println("Digite uma senha: ");
        userRegister.password = entrance.nextLine();

    }

    /**
     * M�todo em que o Usu�rio cadastrado entra no sistema.
     *
     * @return condi��o de usu�rio e �ndice de localiza��o do usu�rio.
     */
    public static String[] getOnline() {
        String[] condition = {"offline", "-1"};
        System.out.println("Digite seu login: ");
        String userLogin = entrance.nextLine();

        count = -1;
        for (i = 0; i < users.size(); i++) {
            if (users.get(i).login.equals(userLogin)) {
                count = i;
                break;
            }
        }
        System.out.println("Ol� " + users.get(count).name);

        System.out.println("Entre com sua senha: ");
        String userPassword = entrance.nextLine();

        if (users.get(count).password.equals(userPassword)) {
            condition[0] = "online";
            condition[1] = String.valueOf(count);
        }
        return condition;
    }

    /**
     * M�todo respons�vel em definir a��es do usu�rio logado
     */
    public static int userMenu(int index, String[] condition) {
        int chosenUserMenu;
        verify = true;
        System.out.println("Bemvindo ao menu do usu�rio " + users.get(index).name + " voc� est� " + condition[0]);
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("Escolha: (1) para Postar, (2) para ir na timeline ou (3) para sair?");
            chosenUserMenu = Integer.parseInt(entrance.nextLine());
            switch (chosenUserMenu) {
                case 1:
                case 2:
                case 3:
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inv�lido, favor digitar o n�mero de uma das op��es:");
            }
        } while (verify);
        return chosenUserMenu;
    }

    /**
     * M�todo respons�vel pela publica��o de posts do usu�rio logado.
     */
    public static void makePost(int index) {
        String confirmOrEdit;
        verify = true;
        User user = users.get(index);
        Post p1 = new Post();
        user.posts.add(p1);


        System.out.println(user.login);

        do {
            System.out.println("Para fazer um novo post, por favor insira os dados segundo o modelo: ");
            System.out.println("data (dd/mm/aaa):");
            dateNow = entrance.nextLine();
            System.out.println("hora (hh:mm):");
            hourNow = entrance.nextLine();
            System.out.println("Agora digite o texto: ");
            newPost = entrance.nextLine();

            p1.date = dateNow;
            p1.hour = hourNow;
            p1.text = newPost;

            System.out.println(dateNow + " �s " + hourNow + " - " + newPost);

            do {
                System.out.println("Digite (c) para confirmar ou (e) para editar novamente seu post:");
                confirmOrEdit = entrance.nextLine().toLowerCase();
                switch (confirmOrEdit) {
                    case "c":
                    case "e":
                        verify = false;
                        break;
                }
            } while (verify);

        } while (confirmOrEdit.equals("e"));

        System.out.println();
    }

    /**
     * M�todo onde se observa todas as postagens feitas pelo usu�rio logado.
     */
    public static void viewTimeline(int index) {
        User user = users.get(index);
        for (Post p : user.posts) {
            System.out.println(p.date + " �s " + p.hour + " - " + p.text);
        }
    }
}
