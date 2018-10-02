public class MontyHall {

    public static void main(String[] args) {
        int[] participantGuesses = {3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1};
        int correctDoorNumber = 1;
        System.out.println(mainCase(correctDoorNumber, participantGuesses));

    }

    public static double mainCase(int correctDoorNumber, int[] participantGuesses) {
        int winnerCounter = 0;
        for (int i = 0; i < participantGuesses.length; i++) {
            if (participantGuesses[i] == 1) {
                participantGuesses[i] += 1;
            } else if (participantGuesses[i] == 2) {
                participantGuesses[i] -= 1;
            } else if (participantGuesses[i] == 3) {
                participantGuesses[i] -= 1;
            }
        }
        for (int j = 0; j < participantGuesses.length; j++) {
            if (participantGuesses[j] == correctDoorNumber) {
                winnerCounter++;
            }
        }

        return winnerCounter / participantGuesses.length * 100;
    }

}