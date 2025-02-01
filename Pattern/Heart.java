import java.util.*;

public class Heart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int sfv = (size / 2) + 1;
        int rect = size / 5;

        int exe = (size - (4 * rect) - 1) / 2;

        for (int i = 1; i <= size; i++) {
            if (i <= rect) {
                for (int j = rect - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print("■");
                }

                for (int x = 0; x < exe; x++) {
                    System.out.print("■");
                }

                for (int k = i; k > 0; k--) {
                    System.out.print("■");
                }
                for (int j = ((rect - i) * 2); j >= 0; j--) {
                    System.out.print(" ");
                }

                for (int k = i; k > 0; k--) {
                    System.out.print("■");
                }

                for (int x = 0; x < exe; x++) {
                    System.out.print("■");
                }

                for (int k = i; k > 0; k--) {
                    System.out.print("■");
                }

                System.out.print("\n");
            }

            // else if (i <= (2 * rect)) {
            // for (int y = 0; y <= size; y++)
            // System.out.print("■");
            // System.out.print("\n");
            // }

            else {
                int temp = 0;
                for (int z = 1; z <= sfv;) {
                    for (int j = 0; j < z; j++)
                        System.out.print(" ");

                    for (int k = sfv; k >= z; k--)
                        System.out.print("■");
                    for (int k = sfv - 1; k >= z; k--)
                        System.out.print("■");

                    if (temp < 2) {
                        z++;
                        temp++;
                    } else if(z+2<=sfv){
                        temp = 0;
                        z += 2;
                    }
                    else z++;
                    System.out.print("\n");
                }
                break;
            }

        }
}
}
