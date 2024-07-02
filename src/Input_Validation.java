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

    public Boolean VLSM_Check(String subnet_mask_input){
        String[] Subnet_Array = subnet_mask_input.split("\\.");
        
        if (Subnet_Array.length != 4) { 
            return false;
        }
        for (String subnet : Subnet_Array) {
            try {
                int value = Integer.parseInt(subnet);
                if (value < 0 || value > 255) { 
                    return false;
                }
                else if(value == 0 || value == 128 ||value == 192 || value == 224|| value == 240 || value == 248 || value == 252|| value == 254 ||value == 255){

                    return true;

                }
                
            } catch (NumberFormatException e) {
                return false; 
            }
            
        }
        return true; 
    }
}