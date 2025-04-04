import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static String userName;
    private static String email;
    private static String password;

    public static boolean registerUser(String name,String mail,String pass){
        boolean addUserName=setUserName(name);
        boolean addPassword=setPassword(pass);
        boolean setMail=setEmail(mail);
        System.out.println(addUserName);
        System.out.println(addPassword);
        System.out.println(setMail);
        return addPassword && addUserName && setMail;
    }

    private static boolean setEmail(String mail) {
        String regex="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(mail);
        return matcher.matches();
    }

    private static boolean setPassword(String pass) {
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(pass);
        return matcher.matches();
    }

    private static boolean setUserName(String name) {
        String regex="^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();
    }
}
