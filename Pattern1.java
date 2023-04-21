
import java.io.*;;

public class Pattern1 {
    public static void main(String[] args) throws IOException{

        // D4 C3 B2 A1 
        // A1 B2 C3 D4 
        // F6 E5 D4 C3 
        // C3 D4 E5 F6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter No of Rows : ");
            int rows = Integer.parseInt(br.readLine());

            char ch = 'D';
            int num = 4;

                for(int i = 1; i <= rows; i++){

                        for(int j = 1; j <= rows; j++){


                            System.out.print(ch + "" + num + " ");

                            if(i % 2 != 0){

                                ch--;num--;

                            }else if(i % 2 == 0){

                                ch++;num++;

                            }

                        }
                System.out.println();

                num++;
                ch++;

                // for(int j = 1; j<= rows-4; i++){

                //     num++;ch++;
                // }

                }
        
    }   
}
