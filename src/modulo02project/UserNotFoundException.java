package modulo02project;

public class UserNotFoundException extends RuntimeException {
    public String getMessage() {
        return "Este login n�o foi encontrado. Por favor, entre com um login j� cadastrado para entrar.";
    }
}