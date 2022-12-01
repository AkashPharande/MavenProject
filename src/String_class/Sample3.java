package String_class;

public class Sample3
{
	public static void main(String[] args) 
	{
		//without using new keyword----> constant pool area
		String s1="ABC";
		String s2="ABC";
		String s3="ABC1";
		
		//using new keyword-----> non-constant pool area
		
		String s4=new String("ABC");
		
		String s5=new String("ABC");
		
		String s6=new String("ABC");
		
		System.out.println(s1==s2);   //boolean return
		System.out.println(s1==s3);   //    -"-
		
		System.out.println(s1==s4);   //    -"-
		System.out.println(s5==s6);   //    -"-
	}

}
