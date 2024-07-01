import java.util.Scanner;
public class App{

public static void main(String[] args) {
    String ip_address_input;

    Input_Validation obj = new Input_Validation();
    Scanner k = new Scanner(System.in);

    System.out.print("Enter IPv4 Address: ");
    ip_address_input = k.next();

    if (obj.get_Four_Octet_Check_Validation(ip_address_input) == true){
        System.out.println("IP Valid");

    }
    else{System.out.println("Ip not Valid");}


// String x = "The value [" +  ip_address_parts_for_check + "] at the octal " + i + " is out of range";
                    

    k.close();


    
}




}