import java.util.Scanner;
 
public class SymmetricMatrix
{   
    public static void main(String[] args)
    {
    
    	System.out.println("Name:Gokul Sali Rajan\nReg No:22MCA029\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:24/03/2023\n"); 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows : ");
         
        int rows = sc.nextInt();
         
        System.out.println("Enter the no. of columns : ");
         
        int cols = sc.nextInt();
         
        int matrix[][] = new int[rows][cols];
         
        System.out.println("Enter the elements :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Printing the input matrix :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
         
        if(rows != cols)
        {
            System.out.println("The given matrix is not a square matrix");
        }
        else
        {
            boolean symmetric = true;
             
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("The given matrix is symmetric...");
            }
            else
            {
                System.out.println("The given matrix is not symmetric...");
            }
        }
         
        sc.close();
    }
}
