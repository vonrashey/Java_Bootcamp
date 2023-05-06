package Section2;
public class SwitchStatements {
    public static void main(String[] args) {


        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("You can wear a shirt");break;
            case "cloudy": System.out.println("You can wear a sweater");break;
            case "rainy": System.out.println("You can wear a raincoat");break;
            case "snowy": System.out.println("You can wear a jacket");break;
            default: System.out.println("You can wear a whatever you want");
                
        }
      

       
        int role = 2;

        switch (role) {
            case 1: System.out.println("You are an admin"); break;
            case 2: System.out.println("You are an editor");break;
            case 3: System.out.println("You are a user");break;
            default: System.out.println("Please contact HR");
        
        }

        int temperature = 75;
        int humidity = 65;

        if(temperature >= 80 && humidity >= 60){
            System.out.println("Too hot and humid");
        }else if(temperature >= 80){System.out.println("Too hot \n");}
        else if(temperature <= 60 && humidity >=60){System.out.println("Too cold and humid\n");}
        else if(temperature <= 60) {System.out.println("Too cold\n");}
        else{System.out.println("Its comfortable\n");}
       
        int age = 25;
        int income = 50000;

        if(age >= 18 && age <= 60 && income >= 30000){
            System.out.println("You are eligible for a new loan");
        }
        else{System.out.println("You are not eligible");}
        
        String lightColor = "green";

        switch (lightColor) {
            case "green":System.out.println("Go!");break;
            case "yellow":System.out.println("Slow down!");break;
            case "red":System.out.println("Stop!");break;
            default:System.out.println("Power outage");
                
        }
       
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":System.out.println("Google it!");break;
            case "Firefox":System.out.println("Open source!");break;
            case "Safari":System.out.println("Apple User!");break;
            default:System.out.println("Power outage");
                
        }
        
        

    }
}
