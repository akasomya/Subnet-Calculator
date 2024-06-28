import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String ip_address;
        Scanner k = new Scanner(System.in);
        int i  = 0;
     
        System.out.print("Enter IPv4 Address: ");
        ip_address = k.next();        

        for (String parts: ip_address.split("\\.")) {
            ++i;

            if(i <= 4){
                if(Integer.parseInt(parts) > 255){System.out.println("The value [" +  parts + "] at the octal " + i + " is out of range");} 
            }         
                
        }

        k.close();
    }
}
