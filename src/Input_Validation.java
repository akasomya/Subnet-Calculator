class Input_Validation {
    public Boolean Octet_Check(String ip_address_input) {
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
}