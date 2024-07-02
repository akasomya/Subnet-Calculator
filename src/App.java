import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Input_Validation one = new Input_Validation();
        Scanner k = new Scanner(System.in);
            String ip_address_input;
            do {
                System.out.print("Enter IPv4 Address: ");
                ip_address_input = k.next();
            } while (!one.Octet_Check(ip_address_input));
        }
    
}