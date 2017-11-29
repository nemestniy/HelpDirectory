public class Main {
    public static void main(String args[]) throws java.io.IOException {
        char number, ignore;
        Help help = new Help();
        System.out.println("LITTLE \t DIRECTORY \t OF \t JAVA \n");
        for (;;) {
            help.greeting();
            do {
                number = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while(!help.isValid(number));

            if(number == '6') break;

            System.out.println();

            help.helpTips(number);
        }

    }
}
