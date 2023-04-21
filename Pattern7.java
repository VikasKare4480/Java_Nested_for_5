// import java.io.*;

public class Pattern7 {

   public static void main(String[] args) {

    // O 
    // 14 13 
    // L K J 
    // 9 8 7 6 
    // E D C B A 


    int rows = 5;

    char ch = 'O';
    int num = 14;



            for(int i = 1; i <= rows; i++){


                    for(int j = 1; j <= i; j++){

                            if(i % 2 != 0){

                                System.out.print(ch + " ");
                                ch--;

                            }else if(i % 2 == 0 ){

                                System.out.print(num + " ");
                                num--;

                            }
                    }
                    if(i % 2 == 0){

                        num = num - (i+1);
                    }else if(i % 2 != 0){

                        for(int k = 1; k <= i+1; k++){

                            ch--;

                        }
                    }
                System.out.println();
            }        
   }    
}
