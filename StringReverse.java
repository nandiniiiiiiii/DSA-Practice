public interface StringReverse {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            char f = sb.charAt(i);
            char b = sb.charAt(sb.length() - 1 - i);

            sb.setCharAt(i, b);
            sb.setCharAt(sb.length() - 1 - i, f);
        }
        System.out.println(sb);
    }
}
