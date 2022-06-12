package TokenizerTest;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {

        String str = "java,c,c++,c#,scala,xml,javascript";
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            String lang = st.nextToken();
            System.out.print(lang+" ");
        }
    }
}
