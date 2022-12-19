package modulo02project.socialnet.exceptions;

public class UserAlreadyRegisteredException extends RuntimeException {
    public String getMessage() {
        return "Já existe um usuário cadastrado com este login!";
    }
}
