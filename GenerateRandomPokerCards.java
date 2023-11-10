import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenerateRandomPokerCards {
    public static void main(String[] args) {
        int numberOfCards = 20; // Adjust this number to set the desired count of random cards

        List<String> ranks = new ArrayList<>(Arrays.asList("1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"));
        List<String> suits = new ArrayList<>(Arrays.asList("Heart", "Diamond", "Spade", "Club"));

        List<String> pokerCards = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < numberOfCards; i++) {
            String rank = ranks.get(random.nextInt(ranks.size()));
            String suit = suits.get(random.nextInt(suits.size()));
            pokerCards.add(suit + "," + rank);
        }

        // Write the poker cards to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("poker_cards.txt"))) {
            for (String card : pokerCards) {
                writer.write(card);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


