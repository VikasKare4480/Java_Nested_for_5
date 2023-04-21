import java.io.*;

class seriesofprime10 {
    
    // Enter Starting No : 10
    // Enter Ending No : 100
    // 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

     

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

            System.out.print("Enter Starting No : ");
            int start_number = Integer.parseInt(br.readLine());

            System.out.print("Enter Ending No : ");
            int end_number = Integer.parseInt(br.readLine());


                for(int i = start_number; i <= end_number; i++){

                    int count = 0;

                        for(int j = 1; j <= end_number / 2; j++){

                                if( i % j == 0){

                                    count++;
                                }
                        }
                        
                        if(count > 2){ 

                            System.out.print("");

                        }else{

                            System.out.print( i + " ");
                        }
                }

                System.out.println();
    }
}
