
public class reverseEachString {

	public static void main(String[] args) {
		
		String name="my name";
		
		String [] arr= name.split(" ");
		String finalReverse=" ";
		for (String individualString : arr) {
			int len= individualString.length();
			
			String indReverse=" ";
			for (int i =len-1; i>=0 ; i--) {
				indReverse=indReverse+individualString.charAt(i);
			}
			
			finalReverse=finalReverse+indReverse+" ";
			
		}
System.out.println(finalReverse);
	}

}
