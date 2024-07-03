import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String ip_address_input;
        String subnet_mask_input;
        Input_Validation one = new Input_Validation();

        try (Scanner k = new Scanner(System.in)) {

            do {
                System.out.print("Enter IPv4 Address: ");
                ip_address_input = k.next();
            } while (!one.ip_Octet_Check(ip_address_input));

            do {
                System.out.print("Enter VLSM: ");
                subnet_mask_input = k.next();
            } while (!one.VLSM_Check(subnet_mask_input));

            
        }
    }
}