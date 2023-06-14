import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
    System.out.println("\nName:Gokul Sali Rajan\nReg No:22MCA029\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:27/04/2023\n\n");
        int i,j,x=0,s=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemets in array");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        for( i=0;i<num;i++){
        System.out.println("\nEnter a Word\n");
        word[i]=sc.nextLine();
        }
        System.out.println("Enter the element to Search");
        String search = sc.nextLine();
        for( i=0;i<num;i++){
            if(word[i].equals(search)){
                 x = i;
                state = true;
                s=x+1;
            }
            }
            if(state){
        System.out.println("Element found at  position = "+s);
            }
            else{
        System.out.println("Element found not found");

            }
    }
    
}
