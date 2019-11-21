import java.util.*;
import java.io.*;

public class Times17
{
      public static void main(String[] args) throws IOException
      {
            BufferedReader f = new BufferedReader(new FileReader("times17.in")); 
            PrintWriter out;
            out = new PrintWriter(new BufferedWriter(new FileWriter("times17.out")));
            StringTokenizer st = new StringTokenizer(f.readLine());
            
            int k = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(""+k, 2) * 17; 
            System.out.println(Integer.toBinaryString(k)); 
            out.println(Integer.toBinaryString(k)); 
            out.close();
      }
}
