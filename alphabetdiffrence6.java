
import java.util.*;
public class alphabetdiffrence6 {

   public static void main(String[] args) {
    // Enter First char : a
    // Enter last char : p
    //  Differece between a and p is : 15
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter First char : ");
            char first_char = sc.nextLine().charAt(0);
            char first_char_temp = first_char;
            // System.out.println(first_char );

            System.out.print("Enter last char : ");
            char last_char = sc.nextLine().charAt(0);
            // System.out.println(last_char);

            int count = 0;

            if(first_char == last_char){

                System.out.println("Same Characters " + first_char + " " +  last_char);

            }else{

                for(int i = 1; i <= 26; i++){

                    if(first_char_temp != last_char){

                        count++;
                        first_char_temp++;

                    }else{

                        break;

                    }
                }
            System.out.println(" Differece between " + first_char + " and " + last_char + " is : " + count );
            sc.close();

        } 
 
   }
}
