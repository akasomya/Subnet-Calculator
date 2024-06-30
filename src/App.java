import java.util.Scanner;
public class App{

    

    String Four_Octet_Check(String ip_address_input){

        return ip_address_input;
    
        
    
    }

public static void main(String[] args) {
    String ip_address_input;

    App obj = new App();
    Scanner k = new Scanner(System.in);

    ip_address_input = k.next();

    String x = obj.Four_Octet_Check(ip_address_input);
    System.out.println(k);
    k.close();


    
}




}