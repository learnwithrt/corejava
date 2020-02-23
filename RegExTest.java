import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegExTest
{
	public static void main(String args[])
	{
		Pattern pat=Pattern.compile("ar.+");
		Matcher match=pat.matcher("arm");
		System.out.println("Pattern is "+pat.pattern());
		System.out.println("The Statement that both patterns match is "+match.matches());
		match=pat.matcher("arrest");
		System.out.println("Pattern is "+pat.pattern());
		System.out.println("The Statement that both patterns match is "+match.matches());
	}
}