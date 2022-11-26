package Modulo01Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RedeSocial {
    public static Scanner entrance = new Scanner(System.in);

    public static List<User> users = new ArrayList<User>();

    public static int i = 1, count = 1, index;
    public static String menu, loginEntrance, dateNow, hourNow, newPost, chosenUserMenu;
    public static boolean verify = true;

    public static void main(String[] args) {

        do {
            inicialMenu();
            if (Objects.equals(menu, "c")) {
                verify = true;
                while (verify) {
                    try {
                        registerUser();
                        verify = false;
                    } catch (UserAlreadyRegisteredException e) {
                        System.out.println(e.getMessage());
                    }
                }
                verify = true;
            } else if (Objects.equals(menu, "e")) {
                verify = true;
                String[] condition = {"offline", "-1"};
                do {
                    while (verify) {
                        try {
                            condition = getOnline();
                            verify = false;
                        } catch (UserNotFoundException e) {
                            System.out.println(e.getMessage());
                            verify = true;
                        } catch (InvalidPasswordException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    index = Integer.parseInt(condition[1]);

                } while (index == -1);

                verify = true;
                do {
                    chosenUserMenu = userMenu(index, condition);
                    switch (chosenUserMenu) {
                        case "p":
                            makePost(index);
                            verify = true;
                            break;
                        case "t":
                            viewTimeline(index);
                            verify = true;
                            break;
                        case "u":
                            viewUsers();
                            verify = true;
                            break;
                        case "f":
                            verify = false;
                            break;
                    }
                } while (verify);

            } else if (Objects.equals(menu, "f")) {
                System.out.println("Você saiu do programa. Foi um prazer, volte sempre que quiser!");
                verify = false;
            }
            verify = true;

        } while (true);

    }

    /**
     * Método responsável pelo menu inicial da rede social
     *
     * @return menu
     */
    public static String inicialMenu() {
        do {
            System.out.println("\n***** Seja bem vindo à nova Rede Social - (versão ß - :P) *****");
            System.out.println("Aqui vc poderá se cadastrar e fazer seus posts!\n");
            System.out.println("Menu inicial: O que deseja fazer?");
            System.out.println("Digite (c) para cadastrar, (e) para entrar ou (f) para fechar o programa: ");
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

    /**
     * Método responsável por registrar login, nome e senha do usuário
     * e armazenar em uma lista.
     * (Array de Strings contendo login, nome e senha.)
     */
    public static void registerUser() throws UserAlreadyRegisteredException {
        System.out.println("Vamos cadastrar um novo usuário então: ");

        User userRegister = new User();
        users.add(userRegister);

        System.out.println("Digite um login: ");
        loginEntrance = entrance.nextLine();


        if (users.size() >= 1) {
            for (i = 0; i < users.size(); i++) {
                if (loginEntrance.equals(users.get(i).login)) {
                    throw new UserAlreadyRegisteredException();
                }
            }
        }
        userRegister.login = loginEntrance;

        System.out.println("Por favor, digite seu nome completo: ");
        userRegister.name = entrance.nextLine();
        System.out.println("Agora digite uma senha: ");
        userRegister.password = entrance.nextLine();

        System.out.println("Usuário cadastrado com sucesso");
        System.out.println("** Você retorna agora para o **\n");

    }

    /**
     * Método em que o Usuário cadastrado entra no sistema.
     *
     * @return condição de usuário e índice de localização do usuário.
     */
    public static String[] getOnline() throws UserNotFoundException, InvalidPasswordException {
        System.out.println("Para entrar, por favor,");
        String[] condition = {"offline", "-1"};

        System.out.println("digite seu login: ");
        String userLogin = entrance.nextLine();

        count = -1;
        verify = false;

        for (i = 0; i < users.size(); i++) {
            if (users.get(i).login.equals(userLogin)) {
                count = i;
                verify = true;
                break;
            }
        }

        if (count == -1) {
            throw new UserNotFoundException();
        }

        System.out.println("Olá " + users.get(count).name + ",");
        System.out.println("entre com sua senha: ");
        String userPassword = entrance.nextLine();

        if (users.get(count).password.equals(userPassword)) {
            condition[0] = "online";
            condition[1] = String.valueOf(count);
        } else {
            throw new InvalidPasswordException();
        }
        return condition;
    }

    /**
     * Método responsável em definir ações do usuário logado
     */
    public static String userMenu(int index, String[] condition) {
        String chosenUserMenu;
        verify = true;
        System.out.println("Bemvindo ao menu do usuário " + users.get(index).name + " você está " + condition[0]);
        do {
            System.out.println("O que deseja fazer agora?");
            System.out.println("Escolha entre uma das opções: ");
            System.out.println("- (p) para fazer um POST;");
            System.out.println("- (t) para vizualizar sua TIMELINE;");
            System.out.println("- (u) para vizualizar outros USUÁRIOS;");
            System.out.println("- (f) para FINALIZAR o programa e sair;");
            chosenUserMenu = entrance.nextLine().toLowerCase();
            switch (chosenUserMenu) {
                case "p":
                case "t":
                case "u":
                case "f":
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inválido, favor digitar uma das opções:");
            }
        } while (verify);
        return chosenUserMenu;
    }

    /**
     * Método responsável pela publicação de posts do usuário logado.
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

            System.out.println("Seu post: ");
            System.out.println(dateNow + " às " + hourNow + " - " + newPost);

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
     * Método onde se observa todas as postagens feitas pelo usuário logado.
     */
    public static void viewTimeline(int index) {
        System.out.println("Até este momento, seus posts são: ");
        User user = users.get(index);
        for (Post p : user.posts) {
            System.out.println(p.date + " às " + p.hour + " - " + p.text);
        }
        System.out.println("** Você retorna agora para o **\n");
    }

    /**
     * Método utilizado para vizualizar todos os usuários cadastrados
     */
    public static void viewUsers() {
        System.out.println("\nAté o momento os usuários cadastrados são: ");
        for (i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).name);
        }
        System.out.println("\n** Você retorna agora para o **\n");
    }
}
