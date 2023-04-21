import java.io.*;


public class evenoddreverserial {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter start no : ");
                int start_num = Integer.parseInt(br.readLine());

                System.out.print("Enter the end Number : ");
                int end_num = Integer.parseInt(br.readLine());

                int oddnum[] = new int[end_num];

                
                        System.out.print("Even nos : ");
                        for(int i = end_num; i >= start_num; i--){

                                if(i % 2 == 0){

                                        System.out.print(i + " ");
                                        // oddnum[i] = i;

                                }
                        }
                        System.out.println();
                        System.out.print("Odd nos : ");

                        for(int i = start_num ; i <= end_num; i++){
                        
                                if(i % 2 != 0){

                                        System.out.print(i + " ");

                                }
                        }
                        System.out.println("evenoddreverserial.main()");
                        



        } 
    
}
