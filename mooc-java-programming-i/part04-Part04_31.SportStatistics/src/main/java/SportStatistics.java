import java.util.Arrays;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        ArrayList<Game> games = readFromFile(file);
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
            if (team.equals(game.getHome()) || team.equals(game.getVisiting())) {
                gamesOfATeam.add(game);
            }
        }
        System.out.println("Games: " + gamesOfATeam.size());
        
        int wins = 0;
        int losses = 0;
        for (Game game : gamesOfATeam) {
            if (game.isWinner(team)) {
                wins++;
            } else {
                losses++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        
 
    }
    
    
    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String reading = reader.nextLine();
                if (reading.equals("")) {
                    continue;
                }
                
                String[] parts = reading.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
           
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return games;
    }
}