import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
	public static void main (String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date = formatter.format(new Date());

		try {
			Files.write(Paths.get("output/testfile" + date + ".txt"), Arrays.asList("test"));
			System.out.println("File created.");
		} catch (Exception e) {
			System.out.println("Error creating file!");
		}
	}
}