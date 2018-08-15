public class Counter {
    int originalNumber;
    int userNumber;

    Counter() {
        this.originalNumber = 0;
        this.userNumber = 0;


    }

    Counter(int input) {
        this.originalNumber = input;
        this.userNumber = input;
    }

    public void add(int number) {
        this.userNumber += number;
    }

    public void add() {
        this.userNumber++;
    }

    public int get() {
        return this.userNumber;
    }

    public void reset() {
        this.userNumber = this.originalNumber;
    }
}
