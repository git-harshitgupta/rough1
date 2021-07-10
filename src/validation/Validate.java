package validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate {
   public static List<String> enterHobbies(int num){
       List<String> hobbies = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<num;i++){
           System.out.println("Enter your "+i+"st hobbie");
           hobbies.add(sc.next());
       }
       return hobbies;
   }
}
