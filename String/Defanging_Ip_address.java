package String;

import Array.Demo;

public class Defanging_Ip_address {
    public String defangIPaddr(String address) {
        String defenge="";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(c=='.'){
                defenge+="[.]";
            }else {
                defenge+=c;
            }
        }
        return defenge;
    }

    public static void main(String[] args) {
        String str = "255.100.50.0";
        Defanging_Ip_address obj=new Defanging_Ip_address();
        System.out.println(obj.defangIPaddr(str));
    }
}
