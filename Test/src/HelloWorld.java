import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println(getTime());
	}

	public static String getTime() {
		long yourmilliseconds = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
		Date resultdate = new Date(yourmilliseconds);
		return sdf.format(resultdate);
	}
}
