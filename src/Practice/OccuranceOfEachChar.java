package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="harshvardhan";
        characterCount(str);
	}

	public static void characterCount(String str) {

		// Creating a HashMap containing char
        // as a key and occurrences as  a value
		
		HashMap<Character,Integer> charcountMap= new HashMap<Character,Integer>();
		
		// Converting given string to char array
		 
        char[] strArray = str.toCharArray();
        // checking each char of strArray
		for(char c:strArray)
		{
			if(charcountMap.containsKey(c))
			{
				//If char is present in charCountMap,
                // incrementing it's count by 1
				charcountMap.put(c,charcountMap.get(c)+1 );
			}
			else
			{
				charcountMap.put(c, 1);
			}
		}
		for(Map.Entry entry:charcountMap.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
