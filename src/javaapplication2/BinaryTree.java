package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.time.Clock.system;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.Clock.*;




public class BinaryTree {
    
    public static int value=0;
    public static String z;
    public static String z2;

    public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
        
                
                
        System.out.println("Enter the word u need to search : ");
 
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferRead.readLine();
    try{
        String[][] max = new String[3][3];

        Reader file1=new Reader("Dictionary.txt",s);
                String file1_z2=z2;
                max[0][0]=file1_z2;
                
                String file1_z=z; 
                
                int file1_value=value;
                max[0][1]=Integer.toString(file1_value);
                value=0;
        Reader file2=new Reader("Dictionary2.txt",s);
                String file2_z2=z2; 
                max[1][0]=file2_z2;
                
                String file2_z=z; 
                
                int file2_value=value;
                max[1][1]=Integer.toString(file2_value);
                 value=0;
        Reader file3=new Reader("Dictionary3.txt",s);
                
                String file3_z2=z2; 
                max[2][0]=file2_z2;
                
                String file3_z=z; 
                
                int file3_value=value;
                max[2][1]=Integer.toString(file3_value);
                value=0;
                
                
                System.out.println("Searching...");
                 TimeUnit.SECONDS.sleep(1);
                     System.out.println("RESULTS:");
                     
        
       
                     
           
                     
                     
                     
                     
         if(file1_value!=0){
             
             System.out.println("The word: "+file1_z2+" : Found in "+file1_z+" "+file1_value+" times");
         } else{
             System.out.println("The word Not Found in Dictionary.txt ");
         }
          if(file2_value!=0){
             System.out.println("The word: "+file2_z2+" : found in "+file2_z+" "+file2_value+" times");
         }  else {
              System.out.println("The word Not Found in Dictionary2.txt");
          }
          if(file3_value!=0){
             System.out.println("The word: "+file3_z2+" : found in "+file3_z+" "+file3_value+" times");
         }else {
              System.out.println("The word Not Found in Dictionary3.txt");
          }
   
          
          
          
          
          
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
        
        
        
    }
}
