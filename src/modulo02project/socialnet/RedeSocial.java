package modulo02project.socialnet;

import modulo02project.socialnet.exceptions.InvalidPasswordException;
import modulo02project.socialnet.exceptions.UserAlreadyRegisteredException;
import modulo02project.socialnet.exceptions.UserNotFoundException;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class RedeSocial {

    private static Scanner entrance = new Scanner(System.in);
    private static List<User> users = new ArrayList<User>();
    private static int i = 1, count = 1, index, optionMenu;
    private static String menu, loginEntrance, nameEntrance, passwordEntrance, dateNow, hourNow, newPost, chosenUserMenu;
    private static boolean verify = true;

    /**
     * M?todo respons?vel por ser o esqueleto da rede social, inici?-la e gerenciar a chamada dos outros m?todos.
     */
    public void start() {

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
                            condition = getOnline(condition);
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
                            viewUsers(index);
                            verify = true;
                            break;
                        case "v":
                            viewOtherTimelines(index);
                            verify = true;
                            break;
                        case "f":
                            verify = false;
                            break;
                    }
                } while (verify);

            } else if (Objects.equals(menu, "f")) {
                System.out.println("Voc? saiu do programa. Foi um prazer, volte sempre que quiser!");
                verify = false;
            }
            verify = true;

        } while (true);
    }

    /**
     * M?todo respons?vel pelo menu inicial da rede social
     * @return menu
     */
    private String inicialMenu() {
        //if (users.size() == 0)
        do {
            System.out.println("\n|===============================================|");
            System.out.println("***** Seja bem vindo ? sua nova Rede Social *****");
            System.out.println("|===============================================|");
            System.out.println("\nMenu inicial: O que deseja fazer?");
            System.out.println("Digite (c) para cadastrar, (e) para entrar ou (f) para fechar o programa: ");
            menu = entrance.nextLine().toLowerCase();
            switch (menu) {
                case "c":
                case "e":
                case "f":
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inv?lido");
            }
        } while (verify || users.size() == 0 && menu.equals("e"));


        return menu;
    }

    /**
     * M?todo respons?vel por registrar login, nome e senha do usu?rio e armazenar em uma lista.
     * (Array de Strings contendo login, nome e senha.)
     */
    private void registerUser() throws UserAlreadyRegisteredException {
        System.out.println("Vamos cadastrar um novo usu?rio ent?o: ");

        System.out.println("Por favor, digite um login: ");
        loginEntrance = entrance.nextLine();

        if (users.size() >= 1) {
            for (i = 0; i < users.size(); i++) {
                if (loginEntrance.equals(users.get(i).getLogin())) {
                    throw new UserAlreadyRegisteredException();
                }
            }
        }

        System.out.println("Agora digite seu nome completo: ");
        nameEntrance = entrance.nextLine();
        System.out.println("E para finalizar, digite uma senha: ");
        passwordEntrance = entrance.nextLine();

        System.out.println("Voc? foi cadastrado com sucesso");
        System.out.println("** Voc? retorna agora para o **\n");

        User userRegister = new User(loginEntrance, nameEntrance, passwordEntrance);
        users.add(userRegister);
    }

    /**
     * M?todo em que o Usu?rio cadastrado entra no sistema.
     * @return condi??o de usu?rio e ?ndice de localiza??o do usu?rio.
     */
    private String @NotNull [] getOnline(String[] condition) throws UserNotFoundException, InvalidPasswordException {
        System.out.println("Para entrar, por favor,");
        condition = new String[]{"offline", "-1"};

        System.out.println("digite seu login: ");
        String userLogin = entrance.nextLine();

        count = -1;
        verify = false;

        for (i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin().equals(userLogin)) {
                count = i;
                verify = true;
                break;
            }
        }

        if (count == -1) {
            throw new UserNotFoundException();
        }

        System.out.println("Ol? " + users.get(count).getName() + ",");
        System.out.println("agora entre com sua senha cadastrada: ");
        String userPassword = entrance.nextLine();

        if (users.get(count).getPassword().equals(userPassword)) {
            condition[0] = "online";
            condition[1] = String.valueOf(count);
        } else {
            throw new InvalidPasswordException();
        }
        return condition;
    }

    /**
     * M?todo respons?vel em definir a??es do usu?rio logado
     */
    private String userMenu(int index, String @NotNull [] condition) {
        String chosenUserMenu;
        verify = true;
        System.out.println("Bem vindo ao menu do usu?rio " + users.get(index).getName() + ", voc? est? " + condition[0]);
        do {
            System.out.println("O que deseja fazer agora? Escolha entre uma das op??es: ");
            System.out.println("- (p) para fazer um POST;");
            System.out.println("- (t) para visualizar sua TIMELINE;");
            System.out.println("- (u) para visualizar outros USU?RIOS;");
            System.out.println("- (v) para visualizar posts de outros USU?RIOS;");
            System.out.println("- (f) para FINALIZAR o programa e sair;");
            chosenUserMenu = entrance.nextLine().toLowerCase();
            switch (chosenUserMenu) {
                case "p":
                case "t":
                case "u":
                case "v":
                case "f":
                    verify = false;
                    break;
                default:
                    System.out.println("Digito inv?lido, favor digitar uma das op??es fornecidas:");
            }
        } while (verify);
        return chosenUserMenu;
    }

    /**
     * M?todo respons?vel pela publica??o de posts do usu?rio logado.
     */
    private void makePost(int index) {
        String confirmOrEdit;
        verify = true;
        User user = users.get(index);
        Post p1 = new Post();
        user.posts.add(p1);

        do {
            int[] arrayOfDateAndHour = dateAndHour();
            int d = arrayOfDateAndHour[0];
            int m = arrayOfDateAndHour[1];
            int a = arrayOfDateAndHour[2];
            int h = arrayOfDateAndHour[3];
            int mi = arrayOfDateAndHour[4];

            dateNow = d + "/" + m + "/" + a;
            hourNow = h + ":" + mi;

            System.out.println("Para fazer um novo post, por favor digite seu texto agora: ");
            newPost = entrance.nextLine();

            p1.setDate(dateNow);
            p1.setHour(hourNow);
            p1.setText(newPost);

            System.out.println("Seu post: ");
            System.out.println(dateNow + " ?s " + hourNow + " - " + newPost + "\n");

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
     * M?todo onde se observa todas as postagens feitas pelo usu?rio logado.
     */
    private void viewTimeline(int index) {
        System.out.println("At? este momento, seus posts s?o: ");
        User user = users.get(index);

        if (user.getPosts().size() == 0) {
            System.out.println("0! Nenhum... Digite (p) na pr?xima pergunta e fa?a o seu 1?!!!\n");
        } else {
            for (Post p : user.getPosts()) {
                System.out.println(p.getDate() + " ?s " + p.getHour() + " - " + p.getText());
            }
        }
        System.out.println("** Voc? retorna agora para o **\n");
    }

    /**
     * M?todo utilizado para visualizar todos os usu?rios cadastrados
     */
    private void viewUsers(int index) {

        System.out.println("\nAt? o momento, os outros usu?rios cadastrados s?o: ");
        if (users.size() == 1) {
            System.out.println("?pa, n?o existem outros usu?rios cadastrados al?m de voc?! Voc? foi o primeiro a cadastrar na Rede Social!");
        } else if (users.size() > 1) {
            for (i = 0; i < users.size(); i++) {
                if (index == i) {
                    continue;
                } else {
                    System.out.println(users.get(i).getName());
                }
            }
        }
        System.out.println("\n** Voc? retorna agora para o **\n");
    }

    /**
     * M?todo que permite a visualiza??o das postagens de outros usu?rios cadastrados.
     */
    private void viewOtherTimelines(int index) {
        System.out.println("Selecione qual o n?mero do usu?rio voc? quer visualizar os posts: ");
        count = 1;

        if (users.size() == 1) {
            System.out.println("N?o existem outros usu?rios cadastrados ainda, por isso n?o existem outros posts!\n");
        } else if (users.size() > 1) {
            for (i = 0; i < users.size(); i++) {
                if (index == i) {
                    continue;
                } else {
                    System.out.println("(" + count + ") para: " + users.get(i).getName());
                }
                count++;
            }
            verify = true;

            while (verify) {
                try {
                    optionMenu = Integer.parseInt(entrance.nextLine());
                    verify = false;
                } catch (InputMismatchException | IndexOutOfBoundsException | NumberFormatException e) {
                    System.out.println("D?gito inv?lido, favor digitar um dos n?meros correspondentes ao(s) outro(s) usu?rio(s): ");
                    System.out.println(e.getMessage());
                }
            }
        }
        verify = true;
        count = 1;
        User registeredUser;

        if (users.size() > 1) {
            if (optionMenu <= index) {
                count = optionMenu - 1;
                registeredUser = users.get(count);
                if (registeredUser.posts.size() != 0) {
                    System.out.println("Post(s) publicados por " + registeredUser.getName() + ": ");
                    for (i = 0; i < registeredUser.posts.size(); i++) {
                        System.out.println(registeredUser.posts.get(i).getDate() + " ?s " + registeredUser.posts.get(i).getHour() + " - " + registeredUser.posts.get(i).getText());
                    }
                } else {
                    verify = false;
                }
            } else {
                count = optionMenu;
                registeredUser = users.get(count);
                if (registeredUser.posts.size() != 0) {
                    System.out.println("Post(s) publicados por " + registeredUser.getName() + ": ");
                    for (i = 0; i < registeredUser.posts.size(); i++) {
                        System.out.println(registeredUser.posts.get(i).getDate() + " ?s " + registeredUser.posts.get(i).getHour() + " - " + registeredUser.posts.get(i).getText());
                    }
                } else {
                    verify = false;
                }
            }
            if (!verify) {
                System.out.println("O usu?rio escolhido ainda n?o publicou nenhum post.");
            }
            System.out.println("\n** Voc? retorna agora para o **\n");
        }
    }

    /**
     * M?todo respons?vel por fornecer a data e a hora.
     * @return Array contendo dados de data e hora.
     */
    private int[] dateAndHour() {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);

        int d = calendar.get(Calendar.DATE);
        int m = calendar.get(Calendar.MONTH) + 1;
        int a = calendar.get(Calendar.YEAR);
        int h = calendar.get(Calendar.HOUR_OF_DAY);
        int mi = calendar.get(Calendar.MINUTE);

        int[] dateAndHourNow = new int[5];
        dateAndHourNow[0] = d;
        dateAndHourNow[1] = m;
        dateAndHourNow[2] = a;
        dateAndHourNow[3] = h;
        dateAndHourNow[4] = mi;

        return dateAndHourNow;
    }
}
