package statistics.matcher;

import statistics.Player;

public class Or implements Matcher {

    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        boolean value = false;
        for (Matcher matcher : matchers) {
            value = value || matcher.matches(p);
        }
        return value;
    }
}
