import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String ipAddressInput;
        String subnetMaskInput;
        InputValidationAndCalculation inputValidator = new InputValidationAndCalculation();

        try (Scanner scanner = new Scanner(System.in)) {

            do {
                System.out.print("Enter IPv4 Address: ");
                ipAddressInput = scanner.next();
            } while (!inputValidator.isValidIpAddress(ipAddressInput));

            do {
                System.out.print("Enter Subnet Mask: ");
                subnetMaskInput = scanner.next();
            } while (!inputValidator.isValidSubnetMask(subnetMaskInput));
            scanner.close();
        }

        ArrayList<Integer> subnetOctets = new ArrayList<>(4);
        String[] subnetOctetArray = subnetMaskInput.split("\\.");
        for (String subnetOctet : subnetOctetArray) {
            int subnetInt = Integer.parseInt(subnetOctet);
            subnetOctets.add(subnetInt);
        }

        ArrayList<Integer> ipOctets = new ArrayList<>(4);
        String[] ipOctetArray = ipAddressInput.split("\\.");
        for (String ipOctet : ipOctetArray) {
            int ipInt = Integer.parseInt(ipOctet);
            ipOctets.add(ipInt);
        }

        long ipAsLong = ((ipOctets.get(0) * 16777216) + (ipOctets.get(1) * 65536) + (ipOctets.get(2) * 256) + (ipOctets.get(3) * 1));
        long subnetAsLong = ((subnetOctets.get(0) * 16777216) + (subnetOctets.get(1) * 65536) + (subnetOctets.get(2) * 256) + (subnetOctets.get(3) * 1));

        long networkAddressAsLong = ipAsLong & subnetAsLong;

        // Convert network address back to dotted decimal format using bitwise operations
        int firstOctet = (int) (networkAddressAsLong / 16777216);
        int secondOctet = (int) ((networkAddressAsLong % 16777216) / 65536);
        int thirdOctet = (int) ((networkAddressAsLong % 65536) / 256);
        int fourthOctet = (int) (networkAddressAsLong % 256);

        String networkAddress = firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;

        System.out.println("Start Host Address: " + networkAddress);

    
        }
    }
