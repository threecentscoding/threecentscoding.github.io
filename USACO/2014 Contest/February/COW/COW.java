//Import Statements
import java.util.*;
import java.io.*;

public class COW
{
      public static void main(String[] args) throws IOException
      {
            BufferedReader br = new BufferedReader(new FileReader("cow.in"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cow.out")));
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            int length = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
        
            long numC = 0;
            long numO = 0;
            long numW = 0;
        
            char[] characters = str.toCharArray();
          
            for (int i = 0; i < length; i++)
            {
                 if (char[i] == 'C')
                 {
                      numC++;
                 }
                 else if (char[i] == 'O')
                 {
                      numO += numC;
                 }
                 else
                 {
                      numW += numO;
                 }
            }
        
            out.println(numW);
            out.close();
      }
}
                    
