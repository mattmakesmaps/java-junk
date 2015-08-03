package Chapter_04;

/**
 * Created by matt on 7/29/15.
 */
class Help {

    boolean isValid(int ch) {
        if ( ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }

    void showMenu() {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Choose one (q to quit): ");
    }

    void helpOn(int what){
        switch (what) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("  statement;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("The break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }
        System.out.println();
    }
}

public class HelpClassDemo {
    public static void main(String args[])
        throws java.io.IOException {

        char user_choice, ignore;
        // instanciate help class
        Help help_system = new Help();

        // show the menu once
        help_system.showMenu();

        // `main loop`
        for (;;) {

            do{
                // Get user input
                user_choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                // Validate user input, execute if valid.
                if (help_system.isValid((int) user_choice)) {
                    help_system.helpOn((int) user_choice);
                }

                // Exit the loop
                if (user_choice == 'q') break;
                // Show menu again if user didn't quit.
                help_system.showMenu();
            } while(help_system.isValid((int) user_choice));
            // Exit the loop
            if (user_choice == 'q') break;
        }
    }
}

