package modulo02project.socialnet.exceptions;

public class InvalidPasswordException extends RuntimeException {
    public String getMessage() {
        return "A senha cadastrada n�o confere com o usu�rio digitado.";
    }
}
