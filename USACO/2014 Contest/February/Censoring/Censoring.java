//Import Statements
import java.util.*;
import java.io.*;

public class Censoring
{   
      public static void main(String[] args) throws IOException
      { 
            BufferedReader f = new BufferedReader(new FileReader("censor.in"));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
            StringTokenizer st = new StringTokenizer(f.readLine());
        
            String explicitWord = st.nextToken();
            st = new StringTokenizer(f.readLine());
            String removeWord = st.nextToken();
        
            while(explicitWord.indexOf(removeWord) != -1)
            {
                  explicitWord.replaceAll(removeWord, "");
            }
        
            out.println(explicitWord);
            out.close();
      }
}
