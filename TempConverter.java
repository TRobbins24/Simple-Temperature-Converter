import java.util.*;
public class TempConverter
{
    

    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Choose your initial temperature.");
         double num = in.nextInt();
            
          Scanner in1 = new Scanner(System.in);
         System.out.println("Choose your temperature type. (Fahrenheit or Celcius)");
        String temp = in1.nextLine();
         
         
         if(temp.contains("Celcius")){
             System.out.println("Your initial temperature is now Fahrenheit!");
             System.out.println((num * 9/5) + 32);

         } else if(temp.contains("Fahrenheit")){
             System.out.println("Your initial temperature is now Celcius");
             System.out.println((num - 32) * 5/9);
         } else {
             System.out.println("Please try again.");
             return;
         }
         
        
        
        
    }
    
  
}
