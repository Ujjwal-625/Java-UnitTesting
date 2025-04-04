import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static String formatDate(String inputDate) throws ParseException {

            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            inputFormat.setLenient(false);
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            outputFormat.setLenient(false);

            Date date = inputFormat.parse(inputDate);
            System.out.println(date);
            System.out.println(outputFormat.format(date));
            return outputFormat.format(date);
    }
}
