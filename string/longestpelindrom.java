package string;

public class longestpelindrom {

    public static void main(String[] args) {

        System.out.println(cp("rahul_luhar"));
    }

    public static boolean cp(String x) {
        boolean re = true;

        for (int i = 0; i < x.length() / 2; i++) {
            if (x.charAt(i) != x.charAt((x.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
