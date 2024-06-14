
public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(String message) {
        super(message);
    }
       
        //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    public ParametrosInvalidosException(String message, Throwable cause) {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    




