import java.util.*;

public class PokerTDD {
    ArrayList<String> whiteListpairs = new ArrayList<>();
    ArrayList<String> blackListpairs = new ArrayList<>();

    public static void main(String[] args) {

    }

    public String selectWinner(ArrayList<String> white, ArrayList<String> black) {
        ArrayList<String> whiteNumbers = new ArrayList<>();
        ArrayList<String> blackNumbers = new ArrayList<>();
        java.util.Collections.sort(white);
        java.util.Collections.sort(black);
        for (int i = 0; i < white.size(); i++) {
            whiteNumbers.add(white.get(i));
            blackNumbers.add(black.get(i));
        }
        highCard2Int(whiteNumbers);
        highCard2Int(blackNumbers);
        for (int i = 0; i < whiteNumbers.size(); i++) {

        }


        if (checkPair(white, "W") > checkPair(black, "B")) {
            return "white wins";
        } else if (checkPair(white, "W") < checkPair(black, "B")) {
            return "black wins";
        } else if (checkPair(white, "W") == checkPair(black, "B")) {
            if (!checkHighCard(whiteListpairs, blackListpairs).equals("Tie.")) {
                return checkHighCard(whiteListpairs, blackListpairs);
            } else {
                return checkHighCard(white, black);
            }

        }
        return "check";
    }

    private void highCard2Int(ArrayList<String> cards) {
        Collections.replaceAll(cards, "T", "10");
        Collections.replaceAll(cards, "J", "11");
        Collections.replaceAll(cards, "Q", "12");
        Collections.replaceAll(cards, "K", "13");
        Collections.replaceAll(cards, "A", "14");
    }

    public int checkPair(ArrayList<String> numberOfPairs, String player) {
        int counter = 0;

        for (int i = 0; i < numberOfPairs.size(); i++) {
            for (int j = i + 1; j < numberOfPairs.size(); j++) {
                if (numberOfPairs.get(i).charAt(0) == numberOfPairs.get(j).charAt(0)) {
                    counter++;
                    if (player.equals("W")) {
                        whiteListpairs.add(String.valueOf(numberOfPairs.get(i).charAt(0)));
                    } else {
                        blackListpairs.add(String.valueOf(numberOfPairs.get(i).charAt(0)));
                    }
                }
            }
        }
        return counter;
    }

    public String checkHighCard(ArrayList<String> whiteList, ArrayList<String> blackList) {
        char[] cardStrength = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2'};
        for (int i = 0; i < cardStrength.length; i++) {
            for (int j = 0; j < blackList.size(); j++) {
                if (whiteList.get(j).charAt(0) == cardStrength[i] && blackList.get(j).charAt(0) != cardStrength[i]) {
                    return "white wins";
                } else if (whiteList.get(j).charAt(0) != cardStrength[i] && blackList.get(j).charAt(0) == cardStrength[i]) {
                    return "black wins";
                }
            }
        }
        return "Tie.";
    }

}


