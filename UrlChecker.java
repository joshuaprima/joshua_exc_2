package chapter02;
import java.util.Scanner;
import java.util.regex.Pattern;

class UrlChecker{
	public static void public static void main(String[] args) {
		Pattern MyPattern = Pattern.compile("^((https?|ftp)://|(www|ftp)\\.)[a-z0-9-]+(\\.[a-z0-9-]+[a-z]+)+([/?].*)?$");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Url to be checked: ");
		String name = input.nextLine();
		Matcher MyMatcher = MyPattern.matcher(name);
		Boolean MyBoolean = MyMatcher.matches();

		if(MyBoolean == true){
			System.out.println("Url is correct");
		}else{
			System.out.println("Url is incorrect");
		}
	}
}