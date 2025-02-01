package string;

class pass {
    public static void main(String[] args) {
        System.out.println(st("ABABABABABABABABABAB1"));
    }
    public static int st(String password) {

        boolean a = false, b = false, c = false, d = false;
        for (char s = 'A'; s <= 'Z'; s++) {
            String se = s + "";

            if (password.contains(se)) {
                a = true;
                break;
            }
        }
        for (char s = 'a'; s <= 'z'; s++) {
            String se = s + "";

            if (password.contains(se)) {
                b = true;
                break;
            }
        }
        for (char s = '0'; s <= '9'; s++) {
            String se = s + "";
            if (password.contains(se)) {
                c = true;
                break;
            }
        }

        char che = password.charAt(0);
        int ccc = 1,op=0;
        for (int i = 1; i < password.length(); i++) {

            
            char th = password.charAt(i);
            if (che == th) {
                ccc++;
            } else {
                ccc = 1;
            }
            che = th;
            if (ccc % 3==0) {
                op++;

            }

        }

        int ans = 0;
        if (!a)
            ans++;
        if (!b)
            ans++;
        if (!c)
            ans++;
            System.out.println("a : "+a +" b : "+ b +" c : "+ c);
            System.out.println("ans : "+ans+" op : "+op);
ans = (ans>op)?ans:op;

    while(ans+password.length()<6) ans++;
    while(password.length()-ans>=20) ans++;
    
    return ans;
//1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3    
//b b a a a a a a a a a a a a a a a c c c c c c
//b b a a 4 a a 5 a a 6 a a 7 c c 8 c c 9
    }
}
