public class Main {
    public static void main(String[] args){
        int n = 10;
        System.out.println(refactorio(n));
    }
    public static int refactorio(int n){
        if(n ==1){
            return 1;
        }
        else{
            return refactorio(n-1)*n;
        }
    }
}
