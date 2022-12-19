package modulo02project.socialnet.exceptions;

public class UserNotFoundException extends RuntimeException {
    public String getMessage() {
        return "Este login não foi encontrado. Por favor, entre com um login já cadastrado para entrar.";
    }
}
