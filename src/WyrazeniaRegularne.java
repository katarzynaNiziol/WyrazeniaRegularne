import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {
        String[] str = {"test@google.com",
                "test.test@google.com",
                "test12.test@google.com",
                "test4334@google.com.pl",
                "test85855@google.com",
                "test8348483@google.com.pl",
                "test4344@google.com.pl",
                "aaa_google.com",
                "_google.com"};

        Pattern p = Pattern.compile("^[a-zA-Z0-9]+[\\._A-Za-z0-9]*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.a-z]*$");
        Matcher m = null;

        for (int x = 0; x < str.length; x++) {
            System.out.println(str[x] + ": ");
            m = p.matcher(str[x]);
            System.out.println(m.matches());
        }
    }
}
