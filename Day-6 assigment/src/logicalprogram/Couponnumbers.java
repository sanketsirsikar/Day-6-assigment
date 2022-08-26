package logicalprogram;
import java.util.Random;
public class Couponnumbers {
	public static void main(String[] args) {
		String str="";
		String alphabet ="abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ023456789";
		System.out.println("Length: "+alphabet.length());
		Random r = new Random();
		for (int i=0; i<=5; i++) {
			char c = alphabet.charAt((r.nextInt(alphabet.length())));
			str = String.valueOf(c)+str;
		}
		System.out.println(str);
}
}
