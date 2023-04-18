import java.io.*;

// import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

// import javax.swing.SpringLayout;

public class Demo5 {

   public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter Number of rows : ");
        int rows = Integer.parseInt(br.readLine());

        //  creation the pattern of fibonacci series 

        int first_number  = 0;
        int second_number  = 1;
        

        for(int i = 1; i <= rows; i++){

            

            for(int j = 1; j <= i; j++){

                System.out.print(first_number + " ");

                int third_number = first_number + second_number;
                first_number = second_number;
                second_number = third_number;
            }
            System.out.println();

        }
   }     
}
