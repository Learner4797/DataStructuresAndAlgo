package recursion;

public class AppendXAtEnd {

	public static void appendAtEnd(String str,int idx,int count,String newString) {
		if(idx == str.length()) {
			for(int i=0;i<count;i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(currChar == 'x') {
			count++;
			appendAtEnd(str,idx+1,count,newString);
		}else {
			newString += currChar; //newString = newString+currChar
			appendAtEnd(str,idx+1,count,newString);
		}
		
	}
	
	public static void main(String[] args) {
		String str = "abcdxhxwxy";
		appendAtEnd(str,0,0,"");

	}

}
