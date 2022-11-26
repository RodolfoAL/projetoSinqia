package Modulo01Project;

public class InvalidPasswordException extends RuntimeException {
    public String getMessage() {
        return "A senha cadastrada não confere com o usuário digitado.";
    }
}
