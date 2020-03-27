package Rikhita.TddJunit;

public class RemoveA {
	public String removeA(String str) {
		String result="";
		int stringlength = str.length();
		if(stringlength==1 && str.charAt(0)!='A')
		{
				result=str;
		}
		else if(stringlength>=2) 
		{
		    char char1=str.charAt(0);
		    char char2=str.charAt(1);
		    if(char1=='A' && char2=='A')
			    result=str.substring(2);
		    else if(char1=='A')
		    	result=str.substring(1);
		    else if(char2=='A')
		    	result=char1+str.substring(2);
		    else
		    	result=str;
		}
		return result;
	}

}
