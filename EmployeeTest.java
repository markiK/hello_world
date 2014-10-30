import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeTest {
	public static void main(String args[]) {
		try {
			Date birth = new SimpleDateFormat("MM/dd/yy").parse("05/12/95");
			Date hire = new SimpleDateFormat("MM/dd/yy").parse("10/9/05");
			Employee employee = new Employee("Tim", "Yellow", birth, hire);
			System.out.println(employee);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
