public class Main {
    public static void main(String args[]) throws java.io.IOException {
        char number, ignore;
        Help help = new Help();
        System.out.println("LITTLE \t DIRECTORY \t OF \t JAVA \n");
        for (;;) {
            help.greeting();
            do {
                number = (char) System.in.read();   //here we read character
                do {
                    ignore = (char) System.in.read();   //here we check extra characters
                } while (ignore != '\n');
            } while(!help.isValid(number));     //here we check for correctness of character

            if(number == '6') break;

            System.out.println();

            help.helpTips(number);
        }

    }
}
