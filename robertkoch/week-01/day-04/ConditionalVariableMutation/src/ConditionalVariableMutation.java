public class ConditionalVariableMutation {
    public static void main(String[] args) {
        int a = 24;
        int out = 0;
        if (a % 2 == 0) {
            ++a;
        }

        System.out.println(out);

        int b = 13;
        String out2 = "";

        if (b > 20) {
            out2 = out2 + "More!";
        } else if (b > 10 && b < 20) {
            out2 = out2 + "Sweet!";
        } else {
            out2 = out2 + "Less";
        }
        System.out.println(out2);


        int c = 123;
        int credit = 100;
        boolean iBonus = false;
        if (credit >= 50 && iBonus == false) {c-=2;}
        else if (credit < 50 && iBonus == false){c -=1;}
        else if (iBonus == true) {c +=0;}
        {System.out.println(c);}





        }


}


