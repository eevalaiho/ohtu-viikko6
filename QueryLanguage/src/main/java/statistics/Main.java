package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
          
        Matcher m = new And( new HasAtLeast(10, "goals"),
                             new HasAtLeast(10, "assists"),
                             new PlaysIn("PHI")
        );

        System.out.println("Player has at least 10 goals AND 10 assists and plays in PHI");
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
        System.out.println("");


        Matcher m2 = new And( new HasFewerThan(10, "goals"),
                new HasFewerThan(10, "assists"),
                new PlaysIn("PHI")
        );

        System.out.println("Player has fewer than 10 goals AND 10 assists and plays in PHI");
        for (Player player : stats.matches(m2)) {
            System.out.println( player );
        }
        System.out.println("");


        Matcher m3 = new Or( new HasAtLeast(40, "goals"),
                new HasAtLeast(60, "assists"),
                new HasAtLeast(85, "points")
        );

        System.out.println("Player has at least 10 goals OR 10 assists OR 10 points");
        for (Player player : stats.matches(m3)) {
            System.out.println( player );
        }
        System.out.println("");
    }
}
