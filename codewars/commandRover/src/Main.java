public class Main {
    public static void main(String[] args) {
    }
    public static int roverMove(int n,String[] moves){
        int destination = 0;
        for (int i = 0; i <moves.length ; i++) {
         if(moves[i].equals("DOWN")&& destination <n*(n-1)){destination = destination +n;}
            if(moves[i].equals("UP")&& destination <n){destination = destination -n;}
            if(moves[i].equals("LEFT")&& (destination /n) % n != 0 ){destination = destination -1;}
            if(moves[i].equals("RIGHT")&& (destination /n) % n != n-1 ){destination = destination +1;}
        }
        return destination;
    }
}
