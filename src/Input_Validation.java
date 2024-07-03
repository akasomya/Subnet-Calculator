class Input_Validation {

    // Method to check if an IP address is valid
    public Boolean ip_Octet_Check(String ip_address_input) {
        String[] ipArray = ip_address_input.split("\\.");

        if (ipArray.length != 4) {
            return false;
        }

        for (String ip : ipArray) {
            try {
                int value = Integer.parseInt(ip);
                if (value < 0 || value > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    // Method to check if a subnet mask is valid for VLSM
    public Boolean VLSM_Check(String subnet_mask_input) {
        String[] subnetArray = subnet_mask_input.split("\\.");

        if (subnetArray.length != 4) {
            return false;
        }

        int previousValue = 255;
        for (String subnet : subnetArray) {
            try {
                int value = Integer.parseInt(subnet);

                // Check if value is a valid subnet mask octet
                switch (value) {
                    case 255:
                    case 254:
                    case 252:
                    case 248:
                    case 240:
                    case 224:
                    case 192:
                    case 128:
                    case 0:
                        break;
                    default:
                        return false;
                }

                // Check for contiguous ones followed by contiguous zeros
                if (value > previousValue) {
                    return false;
                }
                previousValue = value;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    
}