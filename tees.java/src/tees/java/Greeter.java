package tees.java;

public class Greeter {
	public static void main(String[] args)throws Exception{
        try{
            System.out.println("Greetings!"+" "+args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("sam");
        }
            
        }
  
}


