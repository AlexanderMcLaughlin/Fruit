package fruit;

import java.util.Scanner;

public class fruit 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        for(int i=0; i<n; i++)
        {
            int d = in.nextInt();
            int[] sold = new int[d];
            int leftover = 0;
            int maxIn = 0;
            int maxLeft = 0;
            int totalFruit = 0;
            
            for(int j=0; j<d; j++)
                sold[j] = in.nextInt();
            
            
            for(int j=0; j<d; j++)
            {   
                if(j==0) maxIn = sold[0];
                
                if(sold[j]>maxIn && maxIn+leftover<sold[j])
                {   
                    for(;maxIn+leftover < sold[j];)
                    {
                        maxIn++;
                        //Get new leftover
                        leftover=j*maxIn-totalFruit;
                    }
                    
                }
                
                leftover = leftover + (maxIn-sold[j]);
                totalFruit += sold[j];
            }
            
            totalFruit = 0;
            maxLeft = 0;
            for(int j=0; j<d; j++)
            {
                totalFruit += sold[j];
                
                leftover=(j+1)*maxIn-totalFruit;
                        
                if(leftover>maxLeft)
                    maxLeft = leftover;
                
            }
            
             System.out.println(maxIn +" "+ maxLeft);
        }
        
    }
    
}
