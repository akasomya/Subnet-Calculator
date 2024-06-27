import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String ip_address;
        Scanner k = new Scanner(System.in);
    
     
        
        System.out.println("Enter IPv4 Address: ");
        ip_address = k.next();

        

        for (String parts: ip_address.split("\\.")) {
            
            if (Integer.parseInt(parts) > 255){
                System.out.println("The value [" +  parts + "] at the index " + "");
            }
                       
        }

        k.close();
    }
}
