import java.util.*;

interface InnerPlayer {
    void playerName();

    void playerRole();

    void playerScore();
}

/**
 * InnerScoreManagement
 */
class InnerScoreManagement implements InnerPlayer {
    Scanner sc = new Scanner(System.in);

    public void playerName() {
        System.out.println("Enter your Name");
        String playerName = sc.next();
    }

    public void playerRole() {
        System.out.println("Enter your Role");
        String playerRole = sc.next();
    }

    public void playerScore() {
        System.out.println("Enter your Score");
        int playerScore = sc.nextInt();
    }

}

interface Stats {
    void StrikeRate();

    void Average();

    void Centuries();
}

class InnerScoreManagement_1 extends InnerScoreManagement implements Stats {

    public void StrikeRate() {
        System.out.println("Enter your Player Strike Rate");
        int StrikeRate = sc.nextInt();
        if (StrikeRate < 120) {
            System.out.println("Your Strike Rate is Good but not sufficient");
        } else if (StrikeRate <= 150) {
            System.out.println("Your Strike Rate is Good and elgible for");
        } else if (StrikeRate > 150) {
            System.out.println("Your Strike Rate is very good, more than enough and eligible for world cup");
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void Average() {
        System.out.println("Enter your Player Average");
        double Average = sc.nextDouble();
        if (Average < 40) {
            System.out.println("You are not a good player");
        } else {
            System.out.println("You are a good player");
        }

    }

    public void Centuries() {
        System.out.println("Enter your Player Centuries");
        int Centuries = sc.nextInt();
        if (Centuries > 3) {
            System.out.println("You are a good player");
        } else if (Centuries > 6) {
            System.out.println("You are a very good player");
        } else if (Centuries > 15) {
            System.out
                    .println("You are a great player and have sufficient experience to select in world cup next year");
        } else {
            System.out.println("you are very bad player you don't have much experience to select in world cup ");
        }
    }
}

public class ScoreManagement {
    public static void main(String[] args) {
        InnerScoreManagement_1 obj = new InnerScoreManagement_1();
        obj.playerName();
        obj.playerRole();
        obj.playerScore();
        obj.StrikeRate();
        obj.Average();
        obj.Centuries();
    }
}
