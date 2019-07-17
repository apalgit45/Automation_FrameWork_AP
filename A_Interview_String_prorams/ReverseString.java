package A_Interview_String_prorams;

import java.util.ArrayList;
import java.util.HashMap;

public class ReverseString{
	public static void main(String[] args) 
	{ 
		String str1 = "GeeksForGeekS"; 
		System.out.println("Original String : "+str1  );
		System.out.println("Reverse String : "+revString( str1));
		
		String xx="abcd xxx yyy zzz abcd hello hello";
		countword(xx);
	} 

	public static String revString(String str1) {
		String str3="";
		char[] str2 = str1.toCharArray(); 
		for (int i = str2.length-1; i>=0; i--) {
			str3=str3+Character.toString(str2[i]);
		}
		return str3;
	} 
	
	
	public static void countword(String str1) {
		String[] stwrd=str1.split(" ");
		String str2="";
		System.out.println("No of words "+(stwrd.length));
		ArrayList<String> arl=new ArrayList<String>();
		for(int x=0;x<stwrd.length;x++) {
			if(!stwrd[x].equals(str2)) {
				str2=stwrd[x];
				if(!arl.contains(str2))
			       arl.add(str2);
			}
		}	
//		System.out.println("size of ArrList "+arl.size());
	//	arl.remove(0);
	for(int i=0;i<arl.size();i++)  
				System.out.println("Unique word "+(i+1)+" "+arl.get(i));
	
	}
}


