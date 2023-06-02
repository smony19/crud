import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        ATM theATM = ATM.getInstance();
        theATM.run();
    }
}
