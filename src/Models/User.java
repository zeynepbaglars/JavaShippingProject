package Models;
import HelperFunctions.HelperFunctions;

public class User {

   private String fullName;
   private String city;
   private String address;
   private String zipCode;
   private double myPrice;
   private String shippingTrackingNumber;

    public User(String fullName, String city, String address, String zipCode) {
        this.fullName = fullName;
        this.city = HelperFunctions.checkCity(city);
        this.address = address;
        this.zipCode = HelperFunctions.checkZipCode(zipCode);
        this.shippingTrackingNumber=HelperFunctions.generateShippingTrackingNumber(fullName,address,zipCode);

    }

    public double getMyPrice() {
        return myPrice;
    }

    public void setMyPrice(double myPrice) {

        this.myPrice += myPrice;
    }


    @Override
    public String toString() {
        return "----------------\n" +
                "Full Name : " + this.fullName + '\n' +
                "City : " + this.city + '\n' +
                "Adress : " + this.address + '\n' +
                "Zip Code : " + this.zipCode + '\n' +
                "Your Shipping Tracking Number : " + this.shippingTrackingNumber + '\n' +
                "Total User Price : " + this.myPrice + '\n' +
                "----------------";
    }
}
