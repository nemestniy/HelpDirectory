public class Help {
    public static void helpTips(int a){
        switch(a){
            case '1':
                System.out.println("Construction of \"if\":");
                System.out.println("if (condition) operators;");
                System.out.println("else operators;");
                System.out.println();
                break;
            case '2':
                System.out.println("Construction of \"switch\":");
                System.out.println("switch (parameter) {");
                System.out.println("case \"value of parameter\":\n operators;\n break;");
                System.out.println();
                break;
            case '3':
                System.out.println("Construction of \"for\":");
                System.out.println("for (initialization; condition; iteration) {");
                System.out.println("operators;");
                System.out.println("}");
                System.out.println();
                break;
            case '4':
                System.out.println("Construction of \"while\":");
                System.out.println("while (condition) {\noperators;");
                System.out.println("}");
                System.out.println();
                break;
            case '5':
                System.out.println("Construction of \"do-while\":");
                System.out.println("do {\noperators;");
                System.out.println("} while (condition)");
                System.out.println();
                break;
        }
    }

    public static void greeting () {
        System.out.println(" 1.if \n 2.switch \n 3.for \n 4.while \n 5.do-while");
        System.out.print("Enter the number of tip:");


    }

    public static boolean isValid(char ch) {
        if(ch < '1' || ch > '6') {
            System.out.println("Your number is wrong. Please, enter number again.");
            return false;
        }
        else return true;
    }
 }
