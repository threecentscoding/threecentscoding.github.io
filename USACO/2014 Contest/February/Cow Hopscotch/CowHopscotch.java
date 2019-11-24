//Import Statements
import java.util.*;
import java.io.*;

public class CowHopscotch
{
      static char[][] grid;
  
      public static void main(String[] args)
      {   
            public static void main(String[] args) throws IOException 
            {
                  BufferedReader br = new BufferedReader(new FileReader("barnjump.in"));
                  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("barnjump.out")));
                  StringTokenizer st = new StringTokenizer(br.readLine());

                  int row = Integer.parseInt(st.nextToken());
                  int col = Integer.parseInt(st.nextToken());

                  grid = new char[row][col];
                  for(int i = 0; i < row; i++) 
                  {
                      String color = br.readLine();
            
                      for(int j = 0; j < col; j++) 
                      {
                          grid[i][j] = color.charAt(j);
                      }
                  }

                  pw.println(countNumWays(0,0));
                  pw.close();
            }
  
            public static int countNumWays(int x, int y) 
            {
                  if (x == grid.length-1 && y == grid[x].length-1) 
                  {
                      return 1;
                  }
          
                  int pathway = 0;
                  for (int i = x+1; i < grid.length; i++) 
                  {
                      for (int j = y+1; j < grid[i].length; j++) 
                      {
                           if(grid[i][j] != grid[x][y]) 
                           {
                               pathway += count(i, j);
                           }
                      }
                  }
                
                  return pathway;
            }
}

