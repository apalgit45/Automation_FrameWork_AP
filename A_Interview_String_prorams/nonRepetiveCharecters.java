package A_Interview_String_prorams;

public class nonRepetiveCharecters {
	static int cnt=1;
	public static void main(String[] args) {
		String xx="aaaddggbc";
		getcount(xx);

	}

	public static void getcount(String strval ) {
		char temp=' ';
		char cstrval[]=strval.toCharArray();

		for(int i=0;i<strval.length();i++) {
			if(temp!=cstrval[i]) {
				for(int j=i+1;j<strval.length();j++)
				{if (cstrval[i]==cstrval[j])	
					cnt++;
				}
				System.out.println("no of "+cstrval[i]+" --> "+cnt);
				cnt=1;
				temp=cstrval[i];
			}
		}
	}
}

