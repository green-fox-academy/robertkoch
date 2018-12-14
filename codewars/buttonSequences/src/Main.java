public class Main {
    public static void main(String[] args) {
        System.out.println(ledSeq("10011010","10110111"));
    }
    public static String ledSeq(String redSeq, String blueSeq) {

        String lights ="";
        if (redSeq.charAt(0)=='1' && blueSeq.charAt(0) =='1'){
            lights =lights +"R";
        }
        if (redSeq.charAt(0)=='1' && blueSeq.charAt(0) =='0'){
            lights =lights +"R";
        }
        if (redSeq.charAt(0)=='0' && blueSeq.charAt(0) =='1'){
            lights =lights +"B";
        }
        for (int i = 1; i <redSeq.length() ; i++) {
            if(redSeq.charAt(i) == '0'&& blueSeq.charAt(i) == '0'){}

            if(redSeq.charAt(i) == '1' && blueSeq.charAt(i) == '1' && redSeq.charAt(i-1) == '0' ){}
            if(redSeq.charAt(i) == '1' && blueSeq.charAt(i) == '1' && blueSeq.charAt(i-1) == '0' ){}

            if(redSeq.charAt(i) == '1'&& blueSeq.charAt(i) == '1' && redSeq.charAt(i-1) == '0'&& blueSeq.charAt(i-1) == '0'){lights=lights+"R";}

            if(redSeq.charAt(i) == '1' && blueSeq.charAt(i) == '0' && redSeq.charAt(i-1) =='1' && blueSeq.charAt(i-1) =='1' && lights.endsWith("B") ){lights=lights+"R";}
            if(redSeq.charAt(i) == '0' && blueSeq.charAt(i) == '1' && redSeq.charAt(i-1) =='1' && blueSeq.charAt(i-1) =='1' && lights.endsWith("R")  ){lights=lights+"B";}

            if(redSeq.charAt(i) == '1' && blueSeq.charAt(i) == '0' && redSeq.charAt(i-1) =='0' && blueSeq.charAt(i-1) =='0' ){lights=lights+"R";}
            if(redSeq.charAt(i) == '0' && blueSeq.charAt(i) == '1' && redSeq.charAt(i-1) =='0' && blueSeq.charAt(i-1) =='0' ){lights=lights+"B";}

            if(redSeq.charAt(i) == '1' && blueSeq.charAt(i) == '0' && redSeq.charAt(i-1) =='0' && blueSeq.charAt(i-1) =='1' ){lights=lights+"R";}
            if(redSeq.charAt(i) == '0' && blueSeq.charAt(i) == '1' && redSeq.charAt(i-1) =='1' && blueSeq.charAt(i-1) =='0' ){lights=lights+"B";}

        }
        return lights;
    }
}
