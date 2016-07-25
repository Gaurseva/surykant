import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

import org.testng.annotations.Test;

public class OK {

	public static void main(String[] args) {

		/*String downloadFolderPath = "./cscs-selenium/data";

		File f = new File(downloadFolderPath);
		String m = f.getAbsolutePath();
		System.out.println(m.isEmpty());

		if ("abc".equals(m))

			System.out.println(m);*/
		
		int MAX=0;
		
		AtomicInteger count = new AtomicInteger(MAX);
		System.out.println("hello suryakant");
		
	System.out.println("Default value is "+ count.intValue()+" And the get method return will be " +  count.getAndIncrement() );	
	}
}