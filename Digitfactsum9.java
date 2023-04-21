import java.io.*;
// import java.lang.invoke.ClassSpecializer.Factory;

public class Digitfactsum9 {
   
    // Calcualting the sum of Factorials of each digit of number 
    // Enter no to find sum of digit : 1234
    // Sum of the factorial of the digit is : 33
        public static void main(String[] args) throws IOException{


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Calcualting the sum of Factorials of each digit of number ");

            System.out.print("Enter no to find sum of digit : ");
            int num = Integer.parseInt(br.readLine());


            // Using while loop

            int sum = 0;
            // int fact = 1;

            while(num != 0){

                    int rem = num % 10;

                    int fact = 1;
                    
                        for(int i = 1; i <= rem; i++){

                            fact = fact * i;
                        }

                    sum = sum + fact;

                    num /= 10;
            }
            System.out.println("Sum of the factorial of the digit is : " + sum);  
                 
        }
}
