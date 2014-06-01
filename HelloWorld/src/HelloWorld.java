import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.io.*;
import javax.activation.*;
/*first test program with java stuff
* Convention: class names start with capital letter, method names start lower case
* class name must match the src file name exactly.
* There can only be one public class per file (many private classes)
*/ 
public abstract class HelloWorld {
	/* This is my first java program.  
    * This will print 'Hello World' as the output   */

	public static void main(String []args) throws IOException {
		//printHello	();
		//testStrings();
		//testArrays();
		//testRegex();
		//testFileIO();
		//testStdIO();
		//testExceptions();
		//testHashMaps();
		sendEmail();
		
		/*Square sq = new Square(3);
		println("Square Width = "+sq.getWidth()+", Height = "+sq.getHeight()+", Area = "+sq.calcArea());
		
		Triangle tr = new Triangle(3,5);
		println("Triangle Width = "+tr.getWidth()+", Height = "+tr.getHeight()+", Area = "+tr.calcArea());
		
		sq.printSides();
		tr.printSides();
		*/
	}

	// Generic or template method
	static<T> void println(T arg) { System.out.println(arg); }
	
	// Can restrict the types of argument which can go to a template
	abstract <T extends Comparable<T>> T maximum(T x, T y, T z);
	
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
    
	public static void printHello(){
		System.out.println("Hello World"); // prints Hello World 	
	}
	
	public static void testStrings(){
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

	}

	public static void testArrays(){
	       // arrays
	       // Note: c++ style double var[] does work, but is not preferred
	       // double[12] does not work, need a new statement
	       //double[] array = new double[5];
	       double[] array={8,3,6,2,1};
	       double total=0;
	       // for each style statement (only available in >= JDK 1.5
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
	       
	       // vectors exist too!
	       Vector v = new Vector(0);
	       v.addElement(new Double(4.0));
	       v.addElement(new Double(3.2));
	       v.addElement(new Double(2.4));
	       v.addElement(5.6);
	       v.addElement("test");
	       println("Vector capacity: "+v.size());
	       println("First Element: "+v.firstElement()+" Last element: "+v.lastElement());
	       println(v.contains(3.2));
	       println(v.elementAt(0));
	       
	       for(int i=0; i<v.size(); i++){
	    	   System.out.print(v.elementAt(i)+"\t");
	       }
	       println("");
	       
	       Enumeration vEnum = v.elements();
	       while(vEnum.hasMoreElements()){ System.out.print(vEnum.nextElement() + " "); }
	       System.out.println();
	       
	       //ArrayList replaces Vector from Java 2
	       ArrayList a = new ArrayList();
	       a.add(2);
	       a.add(3.4);
	       a.add(7.2);
	       a.add("string");
	       
	       for(int i=0; i<a.size(); i++){
	    	   println(a.get(i));
	       }
	}

	public static void testDates(){
   		//date class
   		Date date = new Date();
   		System.out.println("Todays date: "+date.toString());

   		String date_str=String.format("Todays day: %tA", date);
   		System.out.printf(date_str);

   		println("");
   	
   		//simple date formats might be easier to use. They have a parse option
   		SimpleDateFormat ft= new SimpleDateFormat("yyyy-MM-dd");
   	
   		String input = "1818-11-11"; 

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
   		/*try{
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
*/
		
	}

	public static void testRegex(){
   		//regular expressions with java.util.regex.Patter and java.util.regex.Matcher (imported)
   		String test="My name is Jimmy and I'm 25 years old 342";
   		String pattern="\\b\\w*mmy\\b";
   		String pattern2="\\d+";
    
   		Pattern r = Pattern.compile(pattern);
   		Matcher m = r.matcher(test);
        
   		if(m.find()){
   			println("Found a match: "+m.group(0));
   		}
   		Pattern r2 = Pattern.compile(pattern2);
   		Matcher m2 = r2.matcher(test);
        
   		if(m2.find()){
   			println("Found a match: "+m2.group(0));
   		}		
	}
	
	public static void testFileIO(){
		// File I/O contained in java.io package (imported)
		FileInputStream infile=null;
		FileOutputStream outfile=null;
		
		File inf=new File("input.txt");
		File outf = new File("output.txt");
		
		try{
			infile = new FileInputStream(inf);
			outfile = new FileOutputStream(outf);
			
			int c;
			while((c=infile.read())!=-1){
				outfile.write(c);
			}
			if(infile!=null){ infile.close(); }
			if(outfile!=null){ outfile.close(); }

		}	
		catch(IOException ioe){
			println("IOException in copy");
			println(ioe.getMessage());
			println(ioe.getCause());
		}
		// Creating directories
		String dirname="E:/Documents/Projects/Java/HelloWorld/Files/";
		File d = new File(dirname);
		d.mkdirs();

		//List directories
		String dirname2="E:/Documents/Projects/Java";
		String[] paths;
		File pathd=new File(dirname2);
		paths=pathd.list();
		for(String path:paths){
			println(path);
		}
		
	}
	
	public static void testStdIO(){
		//Reading standard input
		InputStreamReader cin=null;
		
		try{
			cin = new InputStreamReader(System.in);
			println("Enter characters. 'q' to quit");
			char c;
			do{
				c = (char) cin.read();
				println(c);
			}while(c!='q');
		}
		catch(IOException ioe){
			println("IOException caught reading in");
		}
		try{
			if(cin!=null){ cin.close(); }
		}
		catch(IOException ioe){
			println("IOException caught in close");
		}
		
		
	}
	
	public static void testExceptions(){
		// Try...catch statements used on code which could throw an exception
		int[] a = {1,2};
		// exception trying to access out of range array element
		try{
			println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			println("Exception caught: "+e);
		}
		
		// can also have multiple catch statements for different types of exception
		// See tutorial for creating your own exceptions (Checking account class)
	}
	
	public static void testHashMaps(){
		//HashMaps is a list of keys linked with an object
		HashMap m = new HashMap();
		m.put("2H",0);
		m.put("3H", 1);
		m.put("AH",2); //etc
		println("HashMap Elements:");
		System.out.print("\t"+m);
		println("");
		println("Key for 3H= "+m.get("3H"));
		
		// Can make a set to iterate over the map
		Set set = m.keySet();
		println("Size of set= "+set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			println(it.next());
		}
		
		// straight to array?
		Object[] cardNames=m.keySet().toArray();
		for(Object name: cardNames){
			println(name);
		}
	}
	
	public static void sendEmail(){
		
	}
	// can add a finalize method to be run just before object is destroyed
	protected void finalize(){
		println("Finalising HelloWorld object");
	}
	
}
