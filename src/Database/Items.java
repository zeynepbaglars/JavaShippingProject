package Database;

public class Items {

    public static double ItemName(String itemName) {

        double dondur = 0;

        if (itemName.equalsIgnoreCase("Rose teddy bear"))
            dondur = 30;
        else if (itemName.equalsIgnoreCase("Iphone max"))
            dondur = 850.23;
        else if (itemName.equalsIgnoreCase("laptop mouse"))
            dondur = 23.50;
        else if (itemName.equalsIgnoreCase("Monitor"))
            dondur = 90.23;
        else if (itemName.equalsIgnoreCase("charger"))
            dondur = 43.20;
        else if (itemName.equalsIgnoreCase("hdmi cable"))
            dondur = 5.90;
        else if (itemName.equalsIgnoreCase("mug"))
            dondur = 30;


        return dondur;

    }

    public static double colorPrice(String color) {
        double dondur = 0;

        if (color.equalsIgnoreCase("Red"))
            dondur = 10;
        else if (color.equalsIgnoreCase("Blue"))
            dondur = 6;
        else if (color.equalsIgnoreCase("Black"))
            dondur = 4;
        else if (color.equalsIgnoreCase("White"))
            dondur = 2;

        return dondur;
    }


   public static double customText (String text){
       double dondur = 0;

       if (text.length()>10)
           dondur = 5;
       else
           dondur = 3;


       return dondur;
   }
}



