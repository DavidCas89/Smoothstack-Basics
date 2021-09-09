import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.Object;

public class Lamdas 
{
	public static void main(String[] args)
	{
		String[] words = new String[] {"Zeb","Goomba","Kits","Fabulous","Pen"};
		
		System.out.println("Order Short -> Long:");
		Arrays.sort(words, (o1,o2) -> o1.length() - o2.length() );
		
		for(String w: words)
		{
			System.out.println(w);
		}
		
		System.out.println("\nOrder Long -> Short:");
		Arrays.sort(words, (o1,o2) -> o2.length() - o1.length() );
		
		for(String w: words)
		{
			System.out.println(w);
		}
		
		System.out.println("\nOrder Alphabetically:");
		Arrays.sort(words, (o1,o2) -> o1.charAt(0) - o2.charAt(0) );
		
		for(String w: words)
		{
			System.out.println(w);
		}
		
		System.out.println("\nLetters starting with E first");
		Arrays.sort(words, (o1,o2) ->
			{
				if( o1.contains("e")) return -1; else return 1;
			} );
		
		for(String w: words)
		{
			System.out.println(w);
		}
		
		System.out.println("\nUtils");
		Arrays.sort(words, (o1,o2) -> Lamdas.eFirst(o1,o2));
		
		for(String w: words)
		{
			System.out.println(w);
		}
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(9);
		nums.add(81);
		nums.add(1);
		System.out.println("\nNums:"+ prefixNumberString(nums));
		
		
		List<String> wordsList = new ArrayList<String>();
		wordsList.add("app");
		wordsList.add("apple");
		wordsList.add("man");
		wordsList.add("rat");
		wordsList.add("ape");
		List<String> wordsListFiltered = new ArrayList<String>();
		wordsListFiltered = threeLetterWithA(wordsList);
		
		
		System.out.println("\nUnFiltered Words:");
		for(String s: wordsList)System.out.print(s+" ");
		System.out.println("\nFiltered Words:");
		for(String s: wordsListFiltered)System.out.print(s+" ");
		
		
	}
	
	private static int eFirst(String w1, String w2)
	{
		if( w1.contains("e")) return -1; else return 1;
	}
	
	private static String prefixNumberString(List<Integer> list)
	{
		return list.stream().map(i -> i % 2 == 0 ? "e" + i: "o" + i ).collect(Collectors.joining(","));	
	}
	
	private static List<String> threeLetterWithA(List<String> list)
	{
		return list.stream()
				.filter(s -> s.startsWith("a"))
				.filter(t -> t.length() ==  3)
				.collect(Collectors.toList());	
	}

}
