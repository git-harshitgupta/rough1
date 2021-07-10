package tester;

import com.app.core.Volunter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static IOUtilis.IOFilemaker.reciveData;
import static IOUtilis.IOFilemaker.storeDate;
import static validation.Validate.enterHobbies;

public class Tester {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            List<Volunter> list = new ArrayList<>();
            boolean exit =false;
            while(!exit){
                try{
                switch (sc.nextInt()){
                    case 1:
                        System.out.println("Enter id,name,number of hobbies and enter the hobbies, status,dob");
//                        int id, String name, List<String> hobbies, boolean isAvaliable, LocalDate dob
                        list.add(new Volunter(sc.nextInt(), sc.next(), enterHobbies(sc.nextInt()),sc.nextBoolean(), LocalDate.parse(sc.next()) ));
                        break;
                    case 2:
                        System.out.println("Enter the file name where the data to be stored");
                        storeDate(sc.next(),list);
                        break;
                    case 3:
                        System.out.println("Enter the file name where the data is stored");
                        reciveData(sc.next()).forEach(p-> System.out.println(p));
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();}
            }
        }
    }
}
