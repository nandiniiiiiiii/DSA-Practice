public class BAcktracking {
    public static void track(String str, String newstr, int i) {
        if (str.length() == 0) {
            System.out.println(newstr);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char newchar = str.charAt(j);
            String str2 = str.substring(0, j) + str.substring(j+1);
            track(str2, newstr + newchar, i+1);
        }

    }

    public static void main(String[] args) {
        // Backtracking- used in traversal of advance data str.
        // definationi- find all the possible solution and then use the one u want
        String str = "ABC";
        track(str, "", 0);
    }
}
