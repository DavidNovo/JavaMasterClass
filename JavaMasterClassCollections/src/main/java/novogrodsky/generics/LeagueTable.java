package novogrodsky.generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Create a generic class to implement a league table for a sport. The class should allow teams to
 * be added to the list, and store a list of teams that belong to the league.
 */
public class LeagueTable<T extends Team> implements Comparable<T> {

  public String leagueName;
  private ArrayList<T> teamsInLeague = new ArrayList<T>();

  public LeagueTable(String leagueName) {
    this.leagueName = leagueName;
  }

  public boolean addTeam(T team) {
    if (teamsInLeague.contains(team)) {
      System.out.println(team.getName() + " is already in this league");
      return false;
    } else {
      teamsInLeague.add(team);
      System.out.println(team.getName() + " picked for league " + this.leagueName);
      return true;
    }
  }

  /**
   * This method will use the compareTo method
   * defined in the Team class
   */
  public void showLeagueTable() {
    Collections.sort(teamsInLeague);
    for (T t: teamsInLeague) {
      System.out.println(t.getName() + ": " + t.ranking());
    }
  }


  @Override
  public int compareTo(T o) {
    return 0;
  }
}
