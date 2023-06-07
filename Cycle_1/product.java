public class product
{
	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nLAPTOP is the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nWATCH is the lowest price!");
	        
	    }
	    else{
	        System.out.println("\n MOBILE is the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	  	System.out.println("Name:Gokul Sali Rajan\nReg No:22MCA029\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:24/03/2023");
	        product obj1 = new product();
	        product obj2 = new product();
	        product obj3 = new product();
	        obj1.data(101,"LAPTOP",57000.00);
	        obj2.data(102,"WATCH",3000.00);
	        obj3.data(103,"MOBILE",20000.00);
	        System.out.println("Product Information:\nProduct_Code\tProduct_Name\tProduct_Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
