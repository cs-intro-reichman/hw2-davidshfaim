public class TimeCalc {
    public static void main(String[] args) {


    String oldtime = args[0];
    String addtime = args[1];
    int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    // System.out.println("hours: " + hours );
     //System.out.println("minutes: " + minutes );
     //System.out.println("minutes to add: " + addtime );
     
     int tothours = hours + (minutes + Integer.parseInt(addtime)) / 60 ;
     int totminutes = Integer.parseInt(addtime) + minutes + (60 * hours) ;
     int newhours =  tothours % 24 ;
     int newminutes = (totminutes - (60 * tothours));
     if (newminutes < 10 && newhours < 10) {
            System.out.println("0" + newhours + ":0" + newminutes );
     } else if (newminutes < 10 ) {
         System.out.println( newhours + ":0" + newminutes );
     } else if (newhours < 10 ) {
         System.out.println("0" + newhours + ":" + newminutes );
     } else { 
         System.out.println(newhours + ":" + newminutes );
     }

    }
} 
    
       

      
    
        
