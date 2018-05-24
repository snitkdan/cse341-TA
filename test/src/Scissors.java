public class Scissors implements RPSObject {

  public String fight(RPSObject o) {
    return o.fightScissors(this);
  }

  public String fightRock(RPSObject o) {
    return "lose";
  }

  public String fightPaper(RPSObject o) {
    return "win";
  }

  public String fightScissors(RPSObject o) {
    return "tie";
  }

  public String toString() {
    return "Scissors";
  }

}
