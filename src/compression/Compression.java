package compression;

public class Compression {

    public String Comp(String s) {

        int count = 1;

        StringBuilder builder = new StringBuilder();

        for (
                int i = 1; i < s.length(); i++)

        {
            char tmp = s.charAt(i - 1);
            if (tmp == s.charAt(i)) {
                count++;
                if (i != s.length() - 1) continue;
            }

            if (count > 1) {
                builder.append(count);
            }
            builder.append(tmp);

            count = 1;

            if ((i == s.length() - 1) && (tmp != s.charAt(i))) {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
