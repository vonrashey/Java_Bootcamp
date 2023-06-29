package Section5;


import java.util.Arrays;

public class UpdateArray{

public static void main(String[] args) {
  String [] menu = {"sadza", "burger", "chips"} ;
  menu[1] = "bota";
  System.out.println(Arrays.toString(menu));

  String [] newMenu = new String [5];

  for(int i=0; i<menu.length; i++){
    newMenu[i] = menu[i];
  }
  newMenu[3] = "Veggies";
  newMenu[4] = "pie";
   System.out.println(Arrays.toString(newMenu));
}
}