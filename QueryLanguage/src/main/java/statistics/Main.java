package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();

        Matcher m = query.oneOf(
                query.playsIn("PHI")
                        .hasAtLeast(10, "goals")
                        .hasFewerThan(20, "assists").build(),
                query.playsIn("EDM")
                        .hasAtLeast(60, "points").build()
        ).build();

        System.out.println("Player has (at least 10 goals AND fewer than 20 AND plays in PHI) OR (at least 60 points and plays in EDM)");
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
        System.out.println("");


    }
}
