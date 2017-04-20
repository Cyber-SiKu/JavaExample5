import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by siku on 17-4-20.
 */
public class VarifyMailbox {
	boolean varifyMailbox(String mailbox){
		boolean correctness = false;
		String regex = new String("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mailbox);
		if (matcher.find()) {
			if (matcher.start() == 0 && matcher.end() == mailbox.length()) {
				correctness = true;
			}
		}
		return correctness;
	}
}
class TestVarifyMailBox{
	public static void main(String [] argv){
		Scanner in = new Scanner(System.in);
		String str = in.next();
		VarifyMailbox varifyMailbox = new VarifyMailbox();
		if (varifyMailbox.varifyMailbox(str)){
			System.out.println("是");
		}else{
			System.out.println("否");
		}
	}
}