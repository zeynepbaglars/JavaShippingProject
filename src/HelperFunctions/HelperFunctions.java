package HelperFunctions;

import Database.Address;

public class HelperFunctions {

    public static String checkCity(String city) {

        int flag = 0;
        String dondur=null;
        for (String c : Address.getCityList()) {
            if (!city.equalsIgnoreCase(c))
                flag++;
        }
        try {
            if (flag == Address.getCityList().size())
                throw new RuntimeException("We can not continue your process because, there is no shipping that location");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }


        if (flag != Address.getCityList().size())
            dondur= city;

        return dondur;
    }

    public static String generateShippingTrackingNumber(String fullName, String adress, String zipCode) {

        String[] arrNameCode = fullName.split(" ");
        String nameCode = "";
        for (String n : arrNameCode)
            nameCode = nameCode.concat(n.substring(0, 1).toUpperCase());

        return adress.substring(0, 3).toUpperCase() + zipCode + nameCode;


    }

    public static String checkZipCode(String zipCode) {

        String dondur = zipCode;
        String zipCodeControl = zipCode.replaceAll("[^0-9]", "");
        try {
            if (!(zipCodeControl.length() == 5 && zipCode.length() == 5)){
                dondur=null;
            throw new RuntimeException("Please enter valid Zip Code");
            }
        } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }

        return dondur;
    }
}
