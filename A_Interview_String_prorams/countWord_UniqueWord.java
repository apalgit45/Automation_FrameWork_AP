package A_Interview_String_prorams;

import java.util.ArrayList;
import java.util.HashMap;

public class countWord_UniqueWord{
	public static void main(String[] args) 
	{ 
		String str="abcd xxx yyy zzz abcd hello hello";
		countword(str);
	} 
	
	
	public static void countword(String str1) {
		String[] stwrd=str1.split(" ");
		String str2="";
		System.out.print("\nTotal words :   "+(stwrd.length)+"--> "+str1);
		ArrayList<String> arl=new ArrayList<String>();
		for(int x=0;x<stwrd.length;x++) {
			if(!stwrd[x].equals(str2)) {
				str2=stwrd[x];
				if(!arl.contains(str2))
			       arl.add(str2);
			}
		}	
	System.out.print("\nUnique words : "+arl.size()+" -- > ");
	for(int i=0;i<arl.size();i++)  
				System.out.print (" "+arl.get(i));
	}
}


