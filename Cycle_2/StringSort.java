import java.util.Arrays;
import java.util.Scanner;
 public class StringSort{
 	public static void main(String[] args){
 	System.out.println("\nName:Gokul Sali Rajan\nReg No:22MCA029\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:04/04/2023\n\n");
 	int count=0;
 	String tmp;
 	Scanner scan=new Scanner(System.in);
 	System.out.println("Enter the number of strings:");
 	count=scan.nextInt();
 	String str_list[]= new String[count];
 	Scanner scan1=new Scanner(System.in);
 	System.out.println("Enter the strings:");
 	for(int i=0;i<count;i++)
 		str_list[i]=scan1.nextLine();
 		System.out.println("1. Inbuilt Sort\n2. User Defined Sorting");
 		int choice;
 		choice=scan.nextInt();
 		 switch (choice){
 		 case 1:
 		 Arrays.sort(str_list);
 		 System.out.println(Arrays.toString(str_list));
 		 break;
 		 case 2:
 		 for(int i=0;i<count-1;i++)
 		 for(int j=i+1;j<str_list.length;j++)
 		 if(str_list[i].compareTo(str_list[j])>0)
 		 {
 		 tmp=str_list[i];
 		 str_list[i]=str_list[j];
 		 str_list[j]=tmp;
 		 }
 		 System.out.println(Arrays.toString(str_list));
 		 break;
 	}
 }
}
