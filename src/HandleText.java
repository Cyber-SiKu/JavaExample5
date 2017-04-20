import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by siku on 17-4-20.
 */
public class HandleText {
	Scanner in;
	HandleText(){
		super();
		in = new Scanner(System.in);
	}

	int countVowel(String str){
		int count = 0;
		String temp =  str.toLowerCase();
		for (int i = 0;i < temp.length();++i){
			switch (temp.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					++count;
					break;
				default:
					break;
			}
		}
		return count;
	}
	public static void main(String [] argv){
		HandleText handleText = new HandleText();
		ArrayList<String> list = new ArrayList<String>();
		int Vowels = 0;
		StringBuffer vawels_list = new StringBuffer("AaEeIiOoUu");

		String temp  = handleText.in.next();
		while(!temp.equals("#")){
			list.add(temp);
			Vowels += handleText.countVowel(temp);
			temp  = handleText.in.next();
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()){
			temp = it.next();
			System.out.println(temp+":"+temp.length());
		}
		System.out.print(Vowels);
	}
}
