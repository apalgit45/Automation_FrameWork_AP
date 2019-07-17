 package A_Interview_String_prorams;

public class two_string_swaping_without3rdVariable {
public static void main(String[] args) {
	String st1="Hello";
	String st2="Manny";

    //------------- one 
	System.out.println("Before  --> 1st: "+st1+ "  2nd:"+st2 );
    st1=st1+","+st2;
    st2=st1.split(",")[0];
    st1=st1.split(",")[1];
    System.out.println(" After --> 1st: "+st1+ "  2nd:"+st2 );
    
    StringBuffer x=new StringBuffer("name");

  //========  Two   
  	st1=st1+st2;
  	st2=st1.substring(0,st1.length()-st2.length());
      st1=st1.substring(st2.length());
      System.out.println(" After --> 1st: "+st1+ "  2nd:"+st2 );
      
}
}
