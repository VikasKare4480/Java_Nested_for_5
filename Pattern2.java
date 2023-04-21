import java.io.*;

public class Pattern2 {


    // # = = = = 
    // = # = = = 
    // = = # = = 
    // = = = # = 
    // = = = = # 


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NO of rows : ");

        int rows = Integer.parseInt(br.readLine());

            for(int i = 1; i <= rows; i++){

                    for(int j = 1; j <= rows; j++){

                        if(i == j){

                            System.out.print("#" + " ");

                        }else{

                            System.out.print("=" + " ");
                        }

                    }
                System.out.println();

            }
    }   
}
