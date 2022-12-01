package String_class;

public class Sample4_StringClassMethods 
{
	public static void main(String[] args) 
	{
		
	String s1="velocity";
	String s2="ABCD";
	String s3="VELOCITY";
	String s4="my name is Akash";
	String s5="";
	String s6="abcabcabc";
	
	
	
	System.out.println("----------------");
	
	System.out.println(s1.length());   //length()
	
	//s1=s1.toUpperCase();
	
	System.out.println(s1.toUpperCase());   //toUpperCase()
	
	//System.out.println(s1);
	
	System.out.println(s2.toLowerCase());   //toLowerCase()
	
	System.out.println(s1.equals(s3));    //equals()---> case sensitive
	
	System.out.println(s1.equalsIgnoreCase(s3));   //equalsIgnoreCase()---> non sensitive
	
	System.out.println(s2.charAt(0));   //charAt()
	
	System.out.println(s1.indexOf('c'));   //indexOf('')
	System.out.println(s6.lastIndexOf('c'));  //lastIndexOf('')
	
	System.out.println(s4.contains("Akash"));   //contains("")
	
	System.out.println("-----------------------------");
	
	System.out.println(s1.isEmpty());   //isEmpty()
	System.out.println(s5.isEmpty());
	
	System.out.println(s4.startsWith("my"));  //startsWith("")
	System.out.println(s4.endsWith("Akash"));  //endsWith("")
	
	System.out.println("--------------------------------");
	
	System.out.println(s4.replace("Akash", "Aniket"));  //replace("", "")
	
	System.out.println(s1+s3);
	System.out.println(s1.concat(s3).concat(s2)); //concat()
	
	
	System.out.println(s1.substring(4));  //substring()
	System.out.println(s1.substring(1, 6));  //substring( , ))
    }
}
