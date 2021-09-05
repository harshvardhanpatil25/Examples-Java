package RahulShetty;

public class Example13 {
//Logic to Count no of occurence of characters in the string
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = countOccurance("aaanjada",'a');
		System.out.println(count);
	}

private static int countOccurance(String  word ,char character) {
	// TODO Auto-generated method stub
	int count=0;
	for(int i=0;i<word.length();i++)
	{
		if(word.charAt(i)==character)
		{
		count++;
		}
	}
	return count;
}

}
