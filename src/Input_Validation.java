class Input_Validation{
    int i = 0;
    boolean x;

    public Boolean get_Four_Octet_Check_Validation(String ip_address_input){        
    
        for (String ip_address_parts: ip_address_input.split("\\.")) {
            ++i;
            if (i == 4){

                for (String ip_address_parts_for_check: ip_address_input.split("\\.")){
                    int octet = Integer.parseInt(ip_address_parts_for_check);
                    if(octet < 0 || octet > 255){
                    
                    x = false;
                } else{x = true;}

                }   
        
        }else{x = false;}  
        
    }
    return x;       
    
}

}