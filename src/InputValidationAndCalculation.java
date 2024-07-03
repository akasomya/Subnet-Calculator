class InputValidationAndCalculation {
    // Method to check if an IP address is valid
    public boolean isValidIpAddress(String ipAddress) {
        String[] ipArray = ipAddress.split("\\.");

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
    public boolean isValidSubnetMask(String subnetMask) {
        String[] subnetArray = subnetMask.split("\\.");

        if (subnetArray.length != 4) {
            return false;
        }

        int previousValue = 255;
        for (String subnet : subnetArray) {
            try {
                int value = Integer.parseInt(subnet);

                // Check if value is a valid subnet mask octet
                if (!(value == 255 || value == 254 || value == 252 || value == 248 || value == 240 || value == 224 || value == 192 || value == 128 || value == 0)) {
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
