package chapter_03;

/**
 * Created by matt on 7/27/15.
 */
public class ContToLabel {
    public static void main(String args[]) {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner Loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop;
                //if (j == 5) continue outerloop; // This would skip call to `print(j)` when j == 5;
                System.out.print(j);
            }
        }
    }
}
