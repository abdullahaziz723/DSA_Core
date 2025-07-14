import java.util.Arrays;

public class leetcode2410{
    public static void main(String[] args) {
     int []  players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
        // Output: 2
        // Explanation: Players 4 and 7 can be trained by trainers 5 and 8 respectively.
        // Player 9 cannot be trained by any trainer.


    }

    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int count = 0;
        int i = 0; // pointer for players
        int j = 0; // pointer for trainers
        
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                // Match found, move both pointers
                count++;
                i++;
                j++;
            } else {
                // Current trainer can't train this player, try next trainer
                j++;
            }
        }
        return count;
    }
}
