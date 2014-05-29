import java.util.*;
import java.text.*;
/*first test program with java stuff
* Convention: class names start with capital letter, method names start lower case
* class name must match the src file name exactly.
* There can only be one public class per file (many private classes)
*/ 
public class HelloWorld {
	/* This is my first java program.  
    * This will print 'Hello World' as the output   */

	static<T> void println(T arg) { System.out.println(arg); }
	
	public static void printArray(double[] array) {
		  for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i] + " ");
		  }
		  System.out.println();
	}
	public static double[] reverse(double[] list) {
		  double[] result = new double[list.length];

		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		  }
		  return result;
	}
    
	public static void main(String []args) {
       System.out.println("Hello World"); // prints Hello World
       
       // Learn to use conditional operator instead of if... else statement
       int a , b;
       a = 10;
       b = (a == 1) ? 20: 30;
       System.out.println( "Value of b is : " +  b );

       b = (a == 10) ? 20: 30;
       System.out.println( "Value of b is : " + b );
       
       //check the variable type (also works for classes
       String name="Jimmy";
       System.out.println("name is a string: "+(name instanceof String));
    
       //loop statements same as c++
       for(int i=0; i<10; i++){
       	System.out.println("i= "+i);
       }
       
       // Using the number abstract class Integer, String, Double etc.
       //converting numbers to strings for adding together
       int myint = 4;
       System.out.println("x= "+Integer.toString(myint));
       // OR (more general, probably easier to remember
       double mydouble=0.5;
       System.out.println("x= "+String.valueOf(mydouble));
       System.out.println("x= "+mydouble);
       
       // maybe not even neccessary
       // This is poor convention?
       int player=1;
       String player_str="player_"+player;
       System.out.println(player_str);
       
       // maths operators.
       System.out.println(Math.sqrt(mydouble));
       //constants
       System.out.println("e= "+Math.E+" pi= "+Math.PI);

       String str1="Jimmy";
       String str2="jimmy";
       
       if(str1.compareTo(str2)==0){ System.out.println(str1+"="+str2); }
       else{ System.out.println(str1+"!="+str2); }
       if(str1.compareToIgnoreCase(str2)==0){ System.out.println(str1+"="+str2+",ignoring case"); }
       else{ System.out.println(str1+"!="+str2+"ignoring case"); }
       
       // Replacing things in string
       System.out.println(str1.replace("m", "b"));
       
       // arrays
       // Note: c++ style double var[] does work, but is not preferred
       // double[12] does not work, need a new statement
       //double[] array = new double[5];
       double[] array={8,3,6,2,1};
       double total=0;
       // for each style statement (only available in >= JRE 1.5
       printArray(array);
       for (double elem: array){
    	   total+=elem;
       }
       System.out.println("Total= "+String.valueOf(total));
       
       //passing and returning arrays from methods
       double[] reversed= reverse(array);
       printArray(reversed);
       
       java.util.Arrays.sort(array);
       printArray(array);

   	//date class
   	Date date = new Date();
   	System.out.println("Todays date: "+date.toString());

   	String date_str=String.format("Todays day: %tA", date);
   	System.out.printf(date_str);

   	println("");
   	
   	//simple date formats might be easier to use. They have a parse option
   	SimpleDateFormat ft= new SimpleDateFormat("yyyy-MM-dd");
   	
   	String input = args.length == 0 ? "1818-11-11" : args[0]; 

    System.out.print(input + " Parses as "); 

    Date t; 

    try { 
    	t = ft.parse(input); 
    	System.out.println(t); 
    } 
    catch(ParseException e) { 
        System.out.println("Unparseable using " + ft); 
    }
	
    // can sleep for a number of millisiconds
    // need to worry about catching exceptions
    // can measure time difference too
    try{
    	long sleep_time=10;
    	println("Sleeping for "+String.valueOf(sleep_time)+" seconds");
    	long start = System.currentTimeMillis();
    	Thread.sleep(sleep_time*1000);
    	long end = System.currentTimeMillis();
    	long diff=(end-start)/1000;
    	println("Awake! I slept for "+String.valueOf(diff)+" seconds \n");
    }
    catch(Exception e){
    	println("Caught an exception???");
	}

	}
}
