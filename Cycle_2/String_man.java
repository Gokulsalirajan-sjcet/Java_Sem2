//String Manipulation
import java.util.Scanner;
public class String_man{
    public static void main(String[] args) {
    	System.out.println("\nName:Gokul Sali Rajan\nReg No:22MCA029\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:27/04/2023\n\n");
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(0));
        System.out.println("String Contains 'Col' sequence :"+str1.contains("col"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("col","kol"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
