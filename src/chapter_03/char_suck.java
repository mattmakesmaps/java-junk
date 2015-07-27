package chapter_03;

/**
 * Created by matt on 7/27/15.
 * an infinite for loop hack
 */
public class char_suck {
    public static void main(String args[])
        throws java.io.IOException {
            char ch;
            for  ( ; ; ) {
                ch = (char) System.in.read();
                if (ch == 'q') {
                    break;
                }
            }
        System.out.println("You pressed: " + ch);
        }
    }

