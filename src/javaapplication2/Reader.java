
package javaapplication2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author VanTa
 */
public class Reader {

    public Reader(String z, String z2) throws FileNotFoundException, IOException, InterruptedException {
        //find how meny lines 

       // int cnt=0;
    //Scanner sc = new Scanner(new File(z));
    //while(sc.hasNext()){
       // String s = sc.next();
       // cnt++;
       // System.out.println(cnt);
    //}
     
        int length = 0;
        //Scanner br = new Scanner(new File(z));
        BufferedReader br = new BufferedReader(new FileReader(z));
        while (br.readLine() != null) {
            length++;

        }
        System.out.println("Lines of file: " + z + ":" + length);

        //insert all txt file in a table
        BufferedReader br2 = new BufferedReader(new FileReader(z));
        //Scanner br2 = new Scanner(new File(z));
        String[] array1 = new String[length + 1];
        int[] array2 = new int[length + 1];
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = br2.readLine();
            array1[0] = line;
            array2[0] = 1;
            int i = 1;
            while (line != null) {

                sb2.append(line);
                //array[i][0]=line;
                //array[i][1]=String.valueOf(1);
                sb2.append(System.lineSeparator());
                line = br2.readLine();
                //System.out.println(line);
                //check if word exist in table
                int exist = 0;
                for (int j = 0; j < i; j++) {
                    //System.out.println(array1[1]);
                    //System.out.println(line);
                    if (array1[j].equals(line)) {
                        exist = 1;
                        //System.out.println(exist);
                    }
                }

                //frequency add
                if (exist == 1) {
                    for (int j = 0; j < i; j++) {
                        if (line.equals(array1[j])) {
                            array2[j]++;

                        }
                    }
                } else {
                    array1[i] = line;
                    array2[i] = 1;
                    i++;
                }

                //String everything = sb2.toString();
            }
        } finally {

            br2.close();
        }
        //Printig tables
        System.out.println("\n---------------------------------------------------");
        System.out.println("       Word Frequency of file " + z);
        System.out.println("---------------------------------------------------");
        System.out.format("%10s%13s", "Word", "Frequency");
        System.out.println("\n");
        for (int ks = 0; ks < length; ks++) {

            if (array1[ks] != null) {
                // System.out.println(array1[ks]+" exists: "+array2[ks]);
                System.out.format("%10s%6d times %n", array1[ks], array2[ks]);
                //System.out.printf("%10s%6d %4dtimes%n ", array1[ks], array2[ks]);
            }

        }
        //Find max value(frequency) of array2 and save position 
        int max = array2[0];
        int pos = 0;
        for (int l = 0; l < length; l++) {
            if (array1[l] != null) {
                if (array2[l] > max) {
                    max = array2[l];
                    pos = l;
                }
            }
        }
        //Make a binary tree with max value as a root node
        Node root = new Node(array2[pos], array1[pos]);
        System.out.println("Binary Tree With existing frequency");
        System.out.println("Building tree with root value " + root.value);
        for (int k = 0; k < length; k++) {
            if (array1[k] != null && k != pos) {
                root.insert(root, array2[k], array1[k]);
            }
        }
        //System.out.println(z2);

        root.serchInOrder(root, z2, z);

        // System.out.println();
        //System.out.println("NO NO");
        // System.out.println("The word:"+ z2+" : found in "+z+" "+s+" times");
        // System.out.println("The word:"+ z2+" : found in "+z+" "+s+" times");
    }

}
