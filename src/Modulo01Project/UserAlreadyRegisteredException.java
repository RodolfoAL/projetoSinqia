package Modulo01Project;

public class UserAlreadyRegisteredException extends RuntimeException {
    public String getMessage() {
        return "J? existe um usu?rio cadastrado com este login!";
    }
}
